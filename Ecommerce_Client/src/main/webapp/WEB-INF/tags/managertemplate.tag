<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="title" required="true" rtexprvalue="true"%>
<%@ attribute name="content" fragment="true"%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>${title }</title>

<!-- Google Font: Source Sans Pro -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/manager/plugins/fontawesome-free/css/all.min.css">
<!-- Theme style -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/manager/dist/css/adminlte.min.css">

<!-- codemirror -->
<link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/codemirror/5.41.0/codemirror.min.css" />
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/codemirror/5.41.0/theme/blackboard.min.css">
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/codemirror/5.41.0/theme/monokai.min.css">
<script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/codemirror/5.41.0/codemirror.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/codemirror/5.41.0/mode/xml/xml.min.js"></script>

<!-- add summernote -->
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/lang/summernote-ko-KR.min.js"></script>

<!-- DataTables -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/manager/plugins/datatables-bs4/css/dataTables.bootstrap4.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/manager/plugins/datatables-responsive/css/responsive.bootstrap4.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/manager/plugins/datatables-buttons/css/buttons.bootstrap4.min.css">
</head>

<body class="hold-transition sidebar-mini layout-fixed sidebar-collapse">

	<div class="wrapper">
		<!-- Navbar -->
		<nav
			class="main-header navbar navbar-expand navbar-white navbar-light">
			<!-- Left navbar links -->
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" data-widget="pushmenu"
					href="#" role="button"><i class="fas fa-bars"></i></a></li>
				<li class="nav-item d-none d-sm-inline-block"><a
					href="../../index3.html" class="nav-link">Home</a></li>
				<li class="nav-item d-none d-sm-inline-block"><a href="#"
					class="nav-link">Contact</a></li>
			</ul>
		</nav>
		<!-- /.navbar -->

		<!-- Main Sidebar Container -->
		<aside class="main-sidebar sidebar-dark-primary elevation-4">
			<!-- Brand Logo -->
			<a href="../../index3.html" class="brand-link"> <img
				src="${pageContext.request.contextPath }/resources/manager/dist/img/AdminLTELogo.png"
				alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
				style="opacity: .8"> <span
				class="brand-text font-weight-light">AdminLTE 3</span>
			</a>

			<!-- Sidebar -->
			<div class="sidebar">
				<!-- Sidebar user (optional) -->
				<div class="user-panel mt-3 pb-3 mb-3 d-flex">
					<div class="image">
						<img
							src="${pageContext.request.contextPath }/resources/manager/dist/img/user2-160x160.jpg"
							class="img-circle elevation-2" alt="User Image">
					</div>
					<div class="info">
						<a href="#" class="d-block">Alexander Pierce</a>
					</div>
				</div>

				<!-- Sidebar Menu -->
				<nav class="mt-2">
					<ul class="nav nav-pills nav-sidebar flex-column"
						data-widget="treeview" role="menu" data-accordion="false">
						<!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
						<li class="nav-item menu-open"><a
							href="${pageContext.request.contextPath }/manager/banner/index"
							class="nav-link ${bannerActive }"><i
								class="far fa-circle nav-icon"></i>
								<p>Banner</p> </a></li>
						<li class="nav-item menu-open"><a
							href="${pageContext.request.contextPath }/manager/feedback/index"
							class="nav-link ${feedbackActive }"><i
								class="far fa-circle nav-icon"></i>
								<p>Feedback</p> </a></li>
						<li class="nav-item menu-open"><a
							href="${pageContext.request.contextPath }/manager/category/index"
							class="nav-link ${categoryActive }"><i
								class="far fa-circle nav-icon"></i>
								<p>Category</p> </a></li>
						<li class="nav-item menu-open"><a
							href="${pageContext.request.contextPath }/manager/tag/index"
							class="nav-link ${tagActive }"><i
								class="far fa-circle nav-icon"></i>
								<p>Tag</p> </a></li>
						<li class="nav-item menu-open"><a
							href="${pageContext.request.contextPath }/manager/branch/index"
							class="nav-link ${branchActive }"><i
								class="far fa-circle nav-icon"></i>
								<p>Branch</p> </a></li>
						<li class="nav-item menu-open"><a
							href="${pageContext.request.contextPath }/manager/notification/index"
							class="nav-link ${notificationActive }"><i
								class="far fa-circle nav-icon"></i>
								<p>Notification</p> </a></li>
						<li class="nav-item menu-open"><a
							href="${pageContext.request.contextPath }/manager/product/index"
							class="nav-link ${productActive }"><i
								class="far fa-circle nav-icon"></i>
								<p>Product</p> </a></li>
						<li class="nav-item menu-open"><a
							href="${pageContext.request.contextPath }/manager/store/index"
							class="nav-link ${storeActive }"><i
								class="far fa-circle nav-icon"></i>
								<p>Store</p> </a></li>
						<li class="nav-item menu-open"><a
							href="${pageContext.request.contextPath }/manager/user/index"
							class="nav-link ${userActive }"><i
								class="far fa-circle nav-icon"></i>
								<p>User</p> </a></li>

					</ul>
				</nav>
				<!-- /.sidebar-menu -->
			</div>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">

			<jsp:invoke fragment="content"></jsp:invoke>

		</div>
		<!-- /.content-wrapper -->
	</div>

	<div class="modal fade" id="modal-danger">
		<div class="modal-dialog">
			<div class="modal-content bg-danger">
				<div class="modal-header">
					<h4 class="modal-title">Confirm delete</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<p>Are you sure?</p>
				</div>
				<div class="modal-footer justify-content-between">
					<button type="button" class="btn btn-outline-light"
						data-dismiss="modal">Cancel</button>
					<a id="deleteLink"
						data-link="${pageContext.request.contextPath }/manager/category/delete/"
						href="#">
						<button type="button" class="btn btn-outline-light">Confirm</button>
					</a>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
</body>
</html>

