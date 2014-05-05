<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css" />
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js"></script>
<style>
#select-choice-1{
     white-space:normal !important
}   
 </style>
 
<script type ="text/javascript">
var info = document.getElementById('info');
$(document).ready(function() {
$('#info').click(function() {
var info1 = $("#disname").val();
 $.getJSON('http://134.193.136.127:8983/solr/collection1_shard1_replica1/select/?wt=json&json.wrf=?&q=id%3A'+'%22'+info1+'%22', function(result){
    document.getElementById('write').innerHTML = "Disease Information:  " + ","
    document.getElementById('write1').innerHTML = "DISEASE ID: "+ result.response.docs[0].DiseaseID_s + "  ,  " 
    document.getElementById('write2').innerHTML = " CAUSE OF DISEASE: "+ result.response.docs[0].Synonyms_s 
    document.getElementById('write3').innerHTML= " Type Of DISEASE: " + result.response.docs[0].SlimMappings_s
});
});
});
</script>
<script type = "text/javascript">

var info  = document.getElementById('submit');
$(document).ready(function() {
$('#submit').click(function(){
var doctor = $("#distype").val();

$.getJSON('http://134.193.136.127:8983/solr/collection1_shard1_replica1/select/?wt=json&json.wrf=?&q=prim_spec_s%3A'+'%22'+doctor+'%22'+'&fq=doc_City_s%3AKANSAS%5C+CITY', function(result){
 
 document.getElementById('write4').innerHTML = "Doctor Information: " + " ,"
 document.getElementById('write6').innerHTML ="Name :" + result.response.docs[0].first_name_s +'    '+ result.response.docs[0].last_name_s +'   '+ result.response.docs[0].middle_name_s 
 document.getElementById('write7').innerHTML = "Hospital Name : "  + result.response.docs[0].org_s + "  ,  "
 document.getElementById('write8').innerHTML ="Address :"       + result.response.docs[0].line1_address_s + "," + result.response.docs[0].line2_address_s
 document.getElementById('write9').innerHTML ="Location :"       + result.response.docs[0].doc_City_s + "," + result.response.docs[0].doc_State_s
});
});
});

 
</script>
<script src ="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=true"></script>
<script type ="text/javascript">
    var mapProp={
    zoom:10,
    mapTypeId:'roadmap'
};
var map1=new google.maps.Map(
  document.getElementById("map1"),mapProp);
            
var markers = [];
        
if(navigator.geolocation) 
{
    
   navigator.geolocation.getCurrentPosition
   (function(position) {
   
$.getJSON('http://134.193.136.127:8983/solr/collection1_shard1_replica1/select/?wt=json&json.wrf=?&q=prim_spec_s%3A'+'%22'+doctor+'%22'+'&fq=doc_City_s%3AKANSAS%5C+CITY', function(result){
var add1 = result.response.docs[0].line1_address_s + result.response.docs[0].line2_address_s + result.response.docs[0].doc_City_s + result.response.docs[0].doc_State_s;

   var pos = new google.maps.LatLng(position.coords.latitude,
                                       position.coords.longitude);
       
       

      var infowindow = new google.maps.InfoWindow({
        map: map1,
        position: pos,
        //content: 'Location found using HTML5.'
                                                });
        map1.setCenter(pos);
      // var icon = "http://maps.google.com/mapfiles/ms/icons/blue.png";
        var icon1 = "http://findicons.com/files/icons/951/google_maps/32/hospital.png";
        var marker=new google.maps.Marker({
                    map: map1,
                    
        
                    position: pos
                    
                                          });
       
       marker.setMap(map1);
  
       var geocoder = new google.maps.Geocoder();
       //var pos1 = "Chicago";
       
       geocoder.geocode
       ({
				address : add2, 
				region: 'no' 
			            },
                        

         function(results, status) 
         {
		    	
					// Get center
					var coords = new google.maps.LatLng(
						results[0]['geometry']['location'].lat(),
						results[0]['geometry']['location'].lng()
					                                    );

                   // alert(coords);
         
                var marker1=new google.maps.Marker({
                              map: map1,
                                position: coords,
                    icon: new google.maps.MarkerImage(icon1)
                                                  });
                 
 marker1.setMap(map1);
               
//alert(coords);
                 
});
 
 }, function() {
      handleNoGeolocation(true);
       



    });
  });
}
  google.maps.event.addDomListener(window, 'load', initialize);
             

</script>
</head>
<body>
<div data-role ="page" id ="home"  data-inline="true" >
        <header data-role ="header" data-theme="b">
        <h1>disease Search</h1>
             <a href="#home">home</a>
    </header>
    <div data-role="fieldcontain" data-inline="true" >
    <label for="name">Disease</label>
    <input type="text" name ="disname" id="disname" value=""  />
</div>	

<div align ="center">
<a href="#info" data-role="button" data-inline="true" data-theme ="b" data-icon="check">Submit</a>
<a href="index.html" data-role="button" data-inline="true" data-theme ="b" data-icon="delete">Cancel</a>
</div>
</div>
<div data-role = "page" id = "info" data-inline = true>
        <header data-role ="header" data-theme="b">
        <h1>Get doctor</h1>
             <a href="#home">home</a>
    </header>
    <div id ="write"></div>
    <div id ="write1"></div>
    <div id ="write2"></div>
    <div id ="write3"></div> 
    
    <div data-role="fieldcontain" data-inline="true" >
    <label for="name">Disease Type </label>
    <input type="text" name ="distype" id="distype" value=""  />
</div>	

<div align ="center">
<a href="#submit" data-role="button" data-inline="true" data-theme ="b" data-icon="check">Submit</a>
<a href="index.html" data-role="button" data-inline="true" data-theme ="b" data-icon="delete">Cancel</a>
</div>

</div>
<div data-role = "page" id = "submit" data-inline = true>
        <header data-role ="header" data-theme="b">
        <h1>Doctor Information </h1>
             <a href="#home">home</a>
    </header>
   
    <div id ="write4"></div>
    <div id ="write5"></div>
    <div id ="write6"></div>
    <div id ="write7"></div>
    <div id ="write8"></div>
    <div id ="write9"></div>
<div align ="center">
<div id="map1" style="height: 400px; width: 400px"></div>
</div>
</div>
</body>
</html>