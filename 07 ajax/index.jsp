<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script type="application/javascript" src="/js/jquery-1.9.1.js"></script>
</head>

<body>
<script type="application/javascript">
    var f = function() {
        $.ajax({
            'url': '/ajax-search',
            'data': {
                'q': $("#q").val()
            },
            'method': 'get',
            'success': function(obj) {
                $("#res").html(obj.result.join(", "));
            }
        });
    }
</script>

<input id="q" type="text" oninput="f()"/>
<div id="res"/>


</body>
</html>
