<!doctype html>
<html lang="">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
    Secret Text.
    <ul>
        <#if greetings?has_content>
            <#list greetings as g>
                <li><p>${g}, ${username}</p></li>
            </#list>
        <#else>
            No greetings.
        </#if>
    </ul>
</body>
</html>