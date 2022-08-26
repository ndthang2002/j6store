
var app = angular.module("app",[]);
app.controller("ctrl",function($scope,$http){
	
	$scope.form ={};
	
	$scope.sanpham=[];
	
	$scope.reset = function (){
		$scope.form ={};
	}
	
	$scope.create = function(){
		var item  = angular.copy($scope.form);
		$http.post(`/rest/sanpham`,item).then( resp =>{
			$scope.sanpham.push(resp.data);
			$scope.reset();
			alert("them thanh cong ");
			console.log(resp.data);
		})
		.catch(error =>{
			alert("loi roi em oi ");
			console.log("Error",error);
		});		
		
	}
	//cap nhat san pham
	$scope.update = function(){
	var item  = angular.copy($scope.form);
	$http.put(`/rest/sanpham/${item.masp}`,item).then(resp =>{
		var index = $scope.sanpham.findIndex(p => p.id ==item.id);
		$scope.sanpham[index] = item;
	
		alert("cap nhat san pham thanh cong");
	}).catch(error=>{
		alert("loi cap nhat san pham");
		console.log("Error",error);
	})

	}
	// load du lieu dau vao
	$scope.load = function (){
		
		$http.get(`/rest/sanpham`).then(resp =>{
			$scope.sanpham = resp.data;
		})
	}
	// xoa san pham
	$scope.delete=function(item){
		$http.delete(`/rest/sanpham/${item.masp}`).then(resp=>{
			var index =$scope.sanpham.findIndex(p => p.masp == item.masp);
			$scope.danhmuc.splice(index,1);
			alert("xoa san pham thanh cong");
		}).catch(error =>{
			alert("xoa loi");
			console.log("Error",error);
		})
	}
	//view chi tiet
	$scope.edit= function(item){
		$scope.form = angular.copy(item);
	}
		$scope.load();
});