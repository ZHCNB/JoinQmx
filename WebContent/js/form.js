
$(function(){

    var ok1=false;
    var ok2=false;
    var ok3=false;
    var ok4=false;
    var ok5=false;
    // 验证用户名
    $('input[name="name"]').blur(function(){
        //$("#checkname").html("姓名应该为2-10位之间").css("color", "red");
        $(this).addClass("ipt-error");
        $("#checkname1").hide();
        $("#checkname1").hide();    
    }).blur(function(){
        if($(this).val().length >= 2 && $(this).val().length <=10 && $(this).val()!='' && $(this).val().search(/^([\u4e00-\u9fa5]|\u3007)+([\.\uff0e\u00b7\u30fb]?|\u3007?)+([\u4e00-\u9fa5]|\u3007)+$/)==0){
            //$("#checkname").html("正确").css({color: "green", opacity: "0.6"});
            $(this).addClass("ipt-right");
            $("#checkname1").show();
            $("#checkname2").hide();
            ok1=true;
        }else{
            //$("#checkname").html("姓名应该为2-10位之间").css("color", "red");
            $(this).removeClass("ipt-right");
            $(this).addClass("ipt-error");
            $("#checkname2").show();
            $("#checkname1").hide();
        }

    });


    //验证手机
    $('input[name="phone"]').blur(function(){
       // $("#checkphone").html("请输入正确的手机格式").css("color", "red");
        $(this).addClass("ipt-error");
        $("#checkphone1").hide();
        $("#checkphone2").hide();
    }).blur(function(){
        if($(this).val().search(/^1(3|4|5|7|8)\d{9}$/)==-1){
           //$("#checkphone").html("请输入正确的手机格式").css("color", "red");
            $(this).removeClass("ipt-right");
            $(this).addClass("ipt-error");
            $("#checkphone2").show();
            $("#checkphone1").hide();
            alert("请输入正确的手机格式");
        }else{       
            //$("#checkphone").html("正确").css({color: "green", opacity: "0.6"});
            $(this).addClass("ipt-right");
            $(this).removeClass("ipt-error");
            $("#checkphone1").show();
            $("#checkphone2").hide();
            ok2=true;
        }

    });
    $('input[name="number"]').blur(function(){
        if($(this).val().search(/^201\d{7}$/)==-1){
            //$("#number").html("请输入正确的学号格式").css("color", "red");
            $(this).removeClass("ipt-right");
            $(this).addClass("ipt-error");
            $("#snumber1").hide();
            $("#snumber2").show();            
            alert("请输入正确的学号格式");
        }else{
            // $(this).addClass("ipt-right");
            // $(this).removeClass("ipt-error");
            // $("#snumber1").show();
            // $("#snumber2").hide();
            // ok3=true;
            $.ajax({
                url:"checkLogin",
                data:{"num":$(this).val()},
                dataType:"json",
                type:"post",
                success:function(msg){
                    if(msg){
                       // $("#number").html("该学号已报名").css("color", "red");
                       $('input[name="number"]').removeClass("ipt-right");
                       $('input[name="number"]').addClass("ipt-error");
                       $("#snumber2").show();
                       $("#snumber1").hide();
                       alert("该学号已报名");                       
                    }else{
                        $('input[name="number"]').removeClass("ipt-error");
                        $('input[name="number"]').addClass("ipt-right");
                        $("#snumber1").show();
                        $("#snumber2").hide();
                        ok3=true;
                    }
                }
            });
        }

    });
    
    // 验证学院是否为空
    $('input[name="academy"]').blur(function(){
        if($(this).val()=="" || $(this).val().search(/^([\u4e00-\u9fa5]){1,20}$/)==-1){
            $(this).addClass("ipt-error");
            $(this).removeClass("ipt-right");
            $('#checkAc1').hide();
            $('#checkAc2').show();
         }else{
            $(this).addClass("ipt-right");
            $(this).removeClass("ipt-error");
            $('#checkAc2').hide();
            $('#checkAc1').show();
            ok4=true;
                    }
    });
    //验证专业是否为空
    $('input[name="major"]').blur(function(){
        if($(this).val()=="" || $(this).val().search(/^([\u4e00-\u9fa5]){1,20}$/)==-1){
            $(this).addClass("ipt-error");
            $(this).removeClass("ipt-right");
            $('#checkMajor1').hide();
            $('#checkMajor2').show();
         }else{
            $(this).addClass("ipt-right");
            $(this).removeClass("ipt-error");
            $('#checkMajor2').hide();
            $('#checkMajor1').show();
            ok5=true;
                    }
    });
    //提交按钮,所有验证通过方可提交

    $('#submit').click(function(){
        var name = $('input[name="name"]').val();
        var sex = $('input[name="sex"]').val();
        var number = $('input[name="number"]').val();
        var phone = $('input[name="number"]').val();
        var academy = $('input[name="academy"]').val();
        var major = $('input[name="major"]').val();
        var classes = $('input[name="classes"]').val();
        if(ok1 && ok2 && ok3 && ok4 && ok5 ){
            $('form').submit();
            alert("报名成功")
//          $.ajax({
//          url:"submitInfo",
//          data:{
//          "name":name,
//          "sex":sex,
//          "number":number,
//          "phone":phone,
//          "academy":academy,
//          "major":major,
//          "classes":classes
//          },
//          dataType:"json",
//          type:"post",
//          success:function(msg){
//          if(msg){
//          alert("报名成功");
//          }else{
//          alert("报名失败，请重新报名")
//          }
//          }
//          });
        }else{
            alert("报名失败，请确认已正确填写所有内容")
            return false;
        }
    });

});

window.onload=function() {
    document.forms[0].reset();
}
