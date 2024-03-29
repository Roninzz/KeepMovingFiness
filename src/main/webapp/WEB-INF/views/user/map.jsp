<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/10/10
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main1119.css"/>
    <style>
        /*#container {width:300px; height: 180px; }*/
        #container {width:100%; height: 100%; }
    </style>

</head>
<body>
<script src="http://cache.amap.com/lbs/static/es5.min.js"></script>
<script type="text/javascript" src="https://webapi.amap.com/maps?v=1.4.15&key=86b55ba09229724ff90fd03195b637e4"></script>
<script src="//webapi.amap.com/ui/1.0/main.js?v=1.0.11"></script>

<div id="container"></div>

<script type="text/javascript">
    var map = new AMap.Map('container', {
        resizeEnable: true,
        zoom:11,
        center: [116.397428, 39.90923]//默认的地图中心经纬度
    });
</script>

<script type="text/javascript" src="https://cache.amap.com/lbs/static/addToolbar.js"></script>
<script>

//定位
    map.plugin('AMap.Geolocation', function () {
        geolocation = new AMap.Geolocation({
            enableHighAccuracy: true,//是否使用高精度定位，默认:true
            timeout: 10000,          //超过10秒后停止定位，默认：无穷大
            maximumAge: 0,           //定位结果缓存0毫秒，默认：0
            convert: true,           //自动偏移坐标，偏移后的坐标为高德坐标，默认：true
            showButton: true,        //显示定位按钮，默认：true
            buttonPosition: 'LB',    //定位按钮停靠位置，默认：'LB'，左下角
            buttonOffset: new AMap.Pixel(10, 20),//定位按钮与设置的停靠位置的偏移量，默认：Pixel(10, 20)
            showMarker: true,        //定位成功后在定位到的位置显示点标记，默认：true
            showCircle: true,        //定位成功后用圆圈表示定位精度范围，默认：true
            panToLocation: true,     //定位成功后将定位到的位置作为地图中心点，默认：true
            zoomToAccuracy:true      //定位成功后调整地图视野范围使定位位置及精度范围视野内可见，默认：false
        });
        map.addControl(geolocation);
        geolocation.getCurrentPosition();
        AMap.event.addListener(geolocation, 'complete', onComplete);//返回定位信息
        AMap.event.addListener(geolocation, 'error', onError);      //返回定位出错信息
    });

    //解析定位结果
    function onComplete(data) {
        if(data.status == 1){
            console.log("定位成功");
            $("#addressInput").val(data.formattedAddress);
            sessionStorage.setItem("dingWei-lng",data.position.getLng());
            sessionStorage.setItem("dingWei-lat",data.position.getLat());
        }
        var str = [];
        str.push('经度：' + data.position.getLng());
        str.push('纬度：' + data.position.getLat());
        str.push('是否经过偏移：' + (data.isConverted ? '是' : '否'));
        console.log(str.join('<br>'));
    }
    function onError() {
        var str = [];
        str.push('定位失败');
        console.log(str.join('<br>'));
    }

</script>

</body>
</html>