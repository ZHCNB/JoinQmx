<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>报名信息</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<!-- basic styles -->

<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="assets/css/font-awesome.min.css" />

<!--[if IE 7]>
		  <link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" />
		<![endif]-->

<!-- page specific plugin styles -->

<link rel="stylesheet" href="assets/css/jquery-ui-1.10.3.full.min.css" />
<link rel="stylesheet" href="assets/css/datepicker.css" />
<link rel="stylesheet" href="assets/css/ui.jqgrid.css" />

<!-- fonts -->



<!-- ace styles -->

<link rel="stylesheet" href="assets/css/ace.min.css" />
<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />
<link rel="stylesheet" href="assets/css/ace-skins.min.css" />

<!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->

<!-- inline styles related to this page -->

<!-- ace settings handler -->

<script src="assets/js/ace-extra.min.js"></script>

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

<!--[if lt IE 9]>
		<script src="assets/js/html5shiv.js"></script>
		<script src="assets/js/respond.min.js"></script>
		<![endif]-->
</head>

<body>
	<div class="navbar navbar-default" id="navbar">
		<script type="text/javascript">
            try {
                ace.settings.check('navbar', 'fixed')
            } catch (e) {
            }
        </script>

		<div class="navbar-container" id="navbar-container">
			<div class="navbar-header pull-left">
				<a href="#" class="navbar-brand"> <small> <i
						class="icon-leaf"></i> 启明星招新后台管理系统
				</small>
				</a>
				<!-- /.brand -->
			</div>
			<!-- /.navbar-header -->

			<div class="navbar-header pull-right" role="navigation">
				<ul class="nav ace-nav">

					<li class="light-blue"><a data-toggle="dropdown" href="#"
						class="dropdown-toggle"> <img class="nav-user-photo"
							src="assets/avatars/user.jpg" alt="Jason's Photo" /> <span
							class="user-info"> <small>Welcome,</small> <%=session.getAttribute("user_name")%>>
						</span> <i class="icon-caret-down"></i>
					</a>

						<ul
							class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">

							<li><a href="login.jsp"> <i class="icon-off"></i> Logout
							</a></li>
						</ul></li>
				</ul>
				<!-- /.ace-nav -->
			</div>
			<!-- /.navbar-header -->
		</div>
		<!-- /.container -->
	</div>

	<div class="main-container" id="main-container">
		<script type="text/javascript">
            try {
                ace.settings.check('main-container', 'fixed')
            } catch (e) {
            }
        </script>

		<div class="main-container-inner">
			<a class="menu-toggler" id="menu-toggler" href="#"> <span
				class="menu-text"></span>
			</a>

			<div class="sidebar" id="sidebar">
				<script type="text/javascript">
                    try {
                        ace.settings.check('sidebar', 'fixed')
                    } catch (e) {
                    }
                </script>

				<div class="sidebar-shortcuts" id="sidebar-shortcuts">
					<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
						<button class="btn btn-success">
							<i class="icon-signal"></i>
						</button>

						<button class="btn btn-info">
							<i class="icon-pencil"></i>
						</button>

						<button class="btn btn-warning">
							<i class="icon-group"></i>
						</button>

						<button class="btn btn-danger">
							<i class="icon-cogs"></i>
						</button>
					</div>

					<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
						<span class="btn btn-success"></span> <span class="btn btn-info"></span>

						<span class="btn btn-warning"></span> <span class="btn btn-danger"></span>
					</div>
				</div>
				<!-- #sidebar-shortcuts -->

				<ul class="nav nav-list">
					<li class="active"><a href="home.jsp"> <i
							class="icon-dashboard"></i> <span class="menu-text"> 首页 </span>
					</a></li>

					<li class="active open"><a href="#" class="dropdown-toggle">
							<i class="icon-list"></i> <span class="menu-text"> 报名信息 </span> <b
							class="arrow icon-angle-down"></b>
					</a>

						<ul class="submenu">

							<li class="active"><a href="stu_info.jsp"> <i
									class="icon-double-angle-right"></i> 报名信息表
							</a></li>
						</ul></li>
				<!-- /.nav-list -->

				<div class="sidebar-collapse" id="sidebar-collapse">
					<i class="icon-double-angle-left"
						data-icon1="icon-double-angle-left"
						data-icon2="icon-double-angle-right"></i>
				</div>

				<script type="text/javascript">
                    try {
                        ace.settings.check('sidebar', 'collapsed')
                    } catch (e) {
                    }
                </script>
			</div>

			<div class="main-content">
				<div class="breadcrumbs" id="breadcrumbs">
					<script type="text/javascript">
                        try {
                            ace.settings.check('breadcrumbs', 'fixed')
                        } catch (e) {
                        }
                    </script>

					<ul class="breadcrumb">
						<li><i class="icon-home home-icon"></i> <a href="home.jsp">首页</a>
						</li>

						<li><a href="#">报名信息</a></li>
						<li class="active">报名表</li>
					</ul>
					<!-- .breadcrumb -->

					<div class="nav-search" id="nav-search">
						<form class="form-search">
							<span class="input-icon"> <input type="text"
								placeholder="Search ..." class="nav-search-input"
								id="nav-search-input" autocomplete="off" /> <i
								class="icon-search nav-search-icon"></i>
							</span>
						</form>
					</div>
					<!-- #nav-search -->
				</div>

				<div class="page-content">
					<div class="page-header">
						<h1>
							报名信息 <small> <i class="icon-double-angle-right"></i>
								报名信息表
							</small>
						</h1>
					</div>
					<!-- /.page-header -->

					<div class="row">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->

							<div class="alert alert-info">
								<i class="icon-hand-right"></i> 启明星招新后台管理系统
								<button class="close" data-dismiss="alert">
									<i class="icon-remove"></i>
								</button>
							</div>

							<!--表格  -->
							<table id="grid-table"></table>

							<div id="grid-pager" style="position: relative;">
								<!-- <span id = ""refresh class = "icon-refresh green" style = "cursor:pointer; font-size:18px;position:absolute; top:0; z-index:99; padding-left:80px; padding-top:20px;"></span> -->
							</div>

							<script type="text/javascript">
                                var $path_base = "/";//this will be used in gritter alerts containing images
                            </script>

							<!-- PAGE CONTENT ENDS -->
						</div>
						<!-- /.col -->
					</div>
					<!-- /.row -->
				</div>
				<!-- /.page-content -->
			</div>
			<!-- /.main-content -->

			<div class="ace-settings-container" id="ace-settings-container">
				<div class="btn btn-app btn-xs btn-warning ace-settings-btn"
					id="ace-settings-btn">
					<i class="icon-cog bigger-150"></i>
				</div>

				<div class="ace-settings-box" id="ace-settings-box">
					<div>
						<div class="pull-left">
							<select id="skin-colorpicker" class="hide">
								<option data-skin="default" value="#438EB9">#438EB9</option>
								<option data-skin="skin-1" value="#222A2D">#222A2D</option>
								<option data-skin="skin-2" value="#C6487E">#C6487E</option>
								<option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
							</select>
						</div>
						<span>&nbsp; 选择皮肤</span>
					</div>
				</div>
				<!-- /#ace-settings-container -->
			</div>
			<!-- /.main-container-inner -->

			<a href="#" id="btn-scroll-up"
				class="btn-scroll-up btn btn-sm btn-inverse"> <i
				class="icon-double-angle-up icon-only bigger-110"></i>
			</a>
		</div>
		<!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->

		<!-- <![endif]-->

		<!--[if !IE]> -->

		<script type="text/javascript">
            window.jQuery
                    || document
                            .write("<script src='assets/js/jquery-2.0.3.min.js'>"
                                    + "<"+"/script>");
        </script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

		<script type="text/javascript">
            if ("ontouchend" in document)
                document
                        .write("<script src='assets/js/jquery.mobile.custom.min.js'>"
                                + "<"+"/script>");
        </script>
		<script src="assets/js/bootstrap.min.js"></script>
		<script src="assets/js/typeahead-bs2.min.js"></script>

		<!-- page specific plugin scripts -->

		<script src="assets/js/jqGrid/jquery.jqGrid.min.js"></script>
		<script src="assets/js/jqGrid/i18n/grid.locale-en.js"></script>

		<!-- ace scripts -->

		<script src="assets/js/ace-elements.min.js"></script>
		<script src="assets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->


		<script src="assets/js/json2.js"></script>
		<!-- 	<script src="assets/js/jquery-2.1.4.js"></script> -->
		<script type="text/javascript">
            jQuery(function($) {
                var grid_selector = "#grid-table";
                var pager_selector = "#grid-pager";

                jQuery(grid_selector).jqGrid(
                        {
                            //direction: "rtl",

                            url : './StuInfo',
                            datatype : "json",
                            mtype : "post",
                            height : 330,
                            colNames : [ 'ID', 'First Time', 'Name',
                                    'Sex', 'Num', 'Tel', 'Academy', 'Major',
                                    'Class' ],
                            colModel : [ {
                                name : 'id',
                                index : 'id',
                                width : 20,
                                sorttype : "int",
                                editable : true
                            }, {
                                name : 'Time',
                                index : 'Time',
                                width : 100,
                                editable : true,
                                sorttype : "date",
                            }, {
                                name : 'Name',
                                index : 'Name',
                                width : 70,
                                sortable : false,
                                editable : true,
                                edittype : "textarea"
                            }, {
                                name : 'Sex',
                                index : 'Sex',
                                width : 30,
                                sortable : false,
                                editable : true,
                                edittype : "textarea"
                            }, {
                                name : 'Num',
                                index : 'Num',
                                width : 50,
                                sortable : false,
                                editable : true,
                                edittype : "textarea"
                            }, {
                                name : 'Tel',
                                index : 'Tel',
                                width : 70,
                                sortable : false,
                                editable : true,
                                edittype : "textarea"
                            }, {
                                name : 'Ady',
                                index : 'Ady',
                                width : 100,
                                sortable : false,
                                editable : true,
                                edittype : "textarea"
                            }, {
                                name : 'Mjr',
                                index : 'Mjr',
                                width : 100,
                                sortable : false,
                                editable : true,
                                edittype : "textarea"
                            }, {
                                name : 'Cla',
                                index : 'Cla',
                                width : 40,
                                sortable : false,
                                editable : true,
                                edittype : "textarea"
                            } ],
                            /*
                            	name	string	表格列的名称，所有关键字，保留字都不能作为名称使用包括subgrid, cb and rn.
                            	width	number	默认列的宽度，只能是象素值，不能是百分比
                            	sorttype	 string 	用在当datatype为local时，定义搜索列的类型，可选值：int/integer -
                            									对integer排序float/number/currency - 排序数字date - 排序日期text - 排序文本
                            	editable	boolean	单元格是否可编辑
                            	index	string	索引。其和后台交互的参数为sidx
                            	unformat	function	‘unformat’单元格值 
                            	editoptions	array	编辑的一系列选项。{name:’__department_id’,index:’__department_id’,width:200,
                            											editable:true,edittype:’select’,editoptions: {dataUrl:”/jqGrid/admin/deplistforstu.action”}},这个是演示动态从服务器端获取数据。
                            }
                            	edittype	string	可以编辑的类型。可选值：text, textarea, select, checkbox, password, button, image and file.
                             */

                            viewrecords : true,
                            rowNum : 10, //一页显示条数
                            rowList : [ 10, 20, 30 ], //下拉框选择一页显示数据条数
                            pager : pager_selector, //定义翻页导航栏
                            altRows : true, //设置表格 zebra-striped值
                            //toppager: true,
                            sortname : 'id',

                            multiselect : true, //定义是否可以多选
                            //multikey: "ctrlKey",
                            multiboxonly : true, //只有当multiselect = true.起作用，当multiboxonly 为ture时只有选择checkbox才会起作用

                            loadComplete : function() {
                                var table = this;
                                setTimeout(function() {
                                    styleCheckbox(table);

                                    updateActionIcons(table);
                                    updatePagerIcons(table);
                                    enableTooltips(table);
                                }, 1000);
                            },

                            /* editurl: $path_base+"/dummy.html",//nothing is saved  定义对form编辑时的url */
                            caption : "报名详情表",

                            autowidth : true

                        });

                //enable search/filter toolbar
                //jQuery(grid_selector).jqGrid('filterToolbar',{defaultSearch:true,stringResult:true})

                //switch element when editing inline
                function aceSwitch(cellvalue, options, cell) {
                    setTimeout(function() {
                        $(cell).find('input[type=checkbox]').wrap(
                                '<label class="inline" />').addClass(
                                'ace ace-switch ace-switch-5').after(
                                '<span class="lbl"></span>');
                    }, 0);
                }
                //navButtons
                jQuery(grid_selector).jqGrid(
                        'navGrid',
                        pager_selector,
                        { //navbar options
                            edit : false,
                            editicon : 'icon-edit blue',
                            add : false,
                            addicon : 'icon-plus-sign purple',
                            del : false,
                            delicon : 'icon-trash red',
                            search : true,
                            searchicon : 'icon-search orange',
                            refresh : true,
                            refreshicon : 'icon-refresh green',
                            view : true,
                            viewicon : 'icon-zoom-in grey',
                        },
                        {
                            //edit record form
                            //closeAfterEdit: true,
                            recreateForm : true,
                            beforeShowForm : function(e) {
                                var form = $(e[0]);
                                form.closest('.ui-jqdialog').find(
                                        '.ui-jqdialog-titlebar').wrapInner(
                                        '<div class="widget-header" />')
                                style_edit_form(form);
                            }
                        },
                        {
                            //new record form
                            closeAfterAdd : true,
                            recreateForm : true,
                            PagerButtons : false,
                            beforeShowForm : function(e) {
                                var form = $(e[0]);
                                form.closest('.ui-jqdialog').find(
                                        '.ui-jqdialog-titlebar').wrapInner(
                                        '<div class="widget-header" />')
                                style_edit_form(form);
                            }
                        },
                        {
                            //delete record form
                            recreateForm : true,
                            beforeShowForm : function(e) {
                                var form = $(e[0]);
                                if (form.data('styled'))
                                    return false;
                                form.closest('.ui-jqdialog').find(
                                        '.ui-jqdialog-titlebar').wrapInner(
                                        '<div class="widget-header" />')
                                style_delete_form(form);

                                form.data('styled', true);
                            },
                            onClick : function(e) {

                            }
                        },
                        {
                            //search form
                            recreateForm : true,
                            afterShowSearch : function(e) {
                                var form = $(e[0]);
                                form.closest('.ui-jqdialog').find(
                                        '.ui-jqdialog-title').wrap(
                                        '<div class="widget-header" />')
                                style_search_form(form);
                            },
                            afterRedraw : function() {
                                style_search_filters($(this));
                            },
                            multipleSearch : true,
                        /**
                        multipleGroup:true,
                        showQuery: true
                         */
                        },
                        {
                            //view record form
                            recreateForm : true,
                            beforeShowForm : function(e) {
                                var form = $(e[0]);
                                form.closest('.ui-jqdialog').find(
                                        '.ui-jqdialog-title').wrap(
                                        '<div class="widget-header" />')
                            }
                        })

                //导出excel文档
                jQuery(grid_selector).navButtonAdd(pager_selector, {
                    caption : "",
                    buttonicon : "icon-file blue",
                    onClickButton : function() {
                        $.ajax({
                            url : './doExcel',
                            datatype : "json",
                            type : "get",
                            success : function(msg) {
                            }
                        });
                    },
                    position : "first"
                });

                //删除
                jQuery(grid_selector).navButtonAdd(pager_selector, {
                    caption : "",
                    buttonicon : "icon-trash red",
                    onClickButton : function() {
               					var id = $(grid_selector).jqGrid('getGridParam', 'selrow');
               					var rowData = $(grid_selector).jqGrid('getRowData', id);
                        if (confirm("您确定删除此记录？")) {
                            $.ajax({
                                url:'./doDelete',
                                type:"post",
                                dataType:"json",
                                data:{
                                    "num":rowData.Num
                                },
                                success:function(msg){
                                    if(msg){
                                        alert("删除成功");
                                        /* $("grid_selector").jqGrid('clearGridData');  //清空表格
                                        $("grid_selector").setGridParam({
                                            url:'./StuInfo',
                                            mtype:'post',
                                            datatype:'json',
                                            page:1
                                      }).trigger("reloadGrid"); */
                                    }else{
                                        alert("删除失败");
                                    }
                                }
                            });
                        }
                    },
                    position : "first"
                });

                function style_edit_form(form) {
                    //enable datepicker on "sdate" field and switches for "stock" field
                    form.find('input[name=sdate]').datepicker({
                        format : 'yyyy-mm-dd',
                        autoclose : true
                    }).end().find('input[name=stock]').addClass(
                            'ace ace-switch ace-switch-5').wrap(
                            '<label class="inline" />').after(
                            '<span class="lbl"></span>');

                    //update buttons classes
                    var buttons = form.next().find('.EditButton .fm-button');
                    buttons.addClass('btn btn-sm').find('[class*="-icon"]')
                            .remove();//ui-icon, s-icon
                    buttons.eq(0).addClass('btn-primary').prepend(
                            '<i class="icon-ok"></i>');
                    buttons.eq(1).prepend('<i class="icon-remove"></i>')

                    buttons = form.next().find('.navButton a');
                    buttons.find('.ui-icon').remove();
                    buttons.eq(0).append('<i class="icon-chevron-left"></i>');
                    buttons.eq(1).append('<i class="icon-chevron-right"></i>');
                }

                function style_delete_form(form) {
                    var buttons = form.next().find('.EditButton .fm-button');
                    buttons.addClass('btn btn-sm').find('[class*="-icon"]')
                            .remove();//ui-icon, s-icon
                    buttons.eq(0).addClass('btn-danger').prepend(
                            '<i class="icon-trash"></i>');
                    buttons.eq(1).prepend('<i class="icon-remove"></i>')
                }
//查找
                function style_search_filters(form) {
                    form.find('.delete-rule').val('X');
                    form.find('.add-rule').addClass('btn btn-xs btn-primary');
                    form.find('.add-group').addClass('btn btn-xs btn-success');
                    form.find('.delete-group')
                            .addClass('btn btn-xs btn-danger');
                }
                function style_search_form(form) {
                    var dialog = form.closest('.ui-jqdialog');
                    var buttons = dialog.find('.EditTable')
                    buttons.find('.EditButton a[id*="_reset"]').addClass(
                            'btn btn-sm btn-info').find('.ui-icon').attr(
                            'class', 'icon-retweet');
                    buttons.find('.EditButton a[id*="_query"]').addClass(
                            'btn btn-sm btn-inverse').find('.ui-icon').attr(
                            'class', 'icon-comment-alt');
                    buttons.find('.EditButton a[id*="_search"]').addClass(
                            'btn btn-sm btn-purple').find('.ui-icon').attr(
                            'class', 'icon-search');
                }

                function beforeDeleteCallback(e) {
                    var form = $(e[0]);
                    if (form.data('styled'))
                        return false;

                    form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar')
                            .wrapInner('<div class="widget-header" />')
                    style_delete_form(form);

                    form.data('styled', true);
                }

                function beforeEditCallback(e) {
                    var form = $(e[0]);
                    form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar')
                            .wrapInner('<div class="widget-header" />')
                    style_edit_form(form);
                }

                //it causes some flicker when reloading or navigating grid
                //it may be possible to have some custom formatter to do this as the grid is being created to prevent this
                //or go back to default browser checkbox styles for the grid
                function styleCheckbox(table) {
                    /**
                    	$(table).find('input:checkbox').addClass('ace')
                    	.wrap('<label />')
                    	.after('<span class="lbl align-top" />')
                    
                    
                    	$('.ui-jqgrid-labels th[id*="_cb"]:first-child')
                    	.find('input.cbox[type=checkbox]').addClass('ace')
                    	.wrap('<label />').after('<span class="lbl align-top" />');
                     */
                }

                //unlike navButtons icons, action icons in rows seem to be hard-coded
                //you can change them like this in here if you want
                function updateActionIcons(table) {
                    /**
                    var replacement = 
                    {
                    	'ui-icon-pencil' : 'icon-pencil blue',
                    	'ui-icon-trash' : 'icon-trash red',
                    	'ui-icon-disk' : 'icon-ok green',
                    	'ui-icon-cancel' : 'icon-remove red'
                    };
                    $(table).find('.ui-pg-div span.ui-icon').each(function(){
                    	var icon = $(this);
                    	var $class = $.trim(icon.attr('class').replace('ui-icon', ''));
                    	if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]);
                    })
                     */
                }

                //replace icons with FontAwesome icons like above
                function updatePagerIcons(table) {
                    var replacement = {
                        'ui-icon-seek-first' : 'icon-double-angle-left bigger-140',
                        'ui-icon-seek-prev' : 'icon-angle-left bigger-140',
                        'ui-icon-seek-next' : 'icon-angle-right bigger-140',
                        'ui-icon-seek-end' : 'icon-double-angle-right bigger-140'
                    };
                    $(
                            '.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon')
                            .each(
                                    function() {
                                        var icon = $(this);
                                        var $class = $.trim(icon.attr('class')
                                                .replace('ui-icon', ''));

                                        if ($class in replacement)
                                            icon.attr('class', 'ui-icon '
                                                    + replacement[$class]);
                                    })
                }

                function enableTooltips(table) {
                    $('.navtable .ui-pg-button').tooltip({
                        container : 'body'
                    });
                    $(table).find('.ui-pg-div').tooltip({
                        container : 'body'
                    });
                }

                //var selr = jQuery(grid_selector).jqGrid('getGridParam','selrow');

            });
        </script>
</body>
</html>

