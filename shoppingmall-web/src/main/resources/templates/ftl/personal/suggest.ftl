<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

    <title>意见反馈</title>

    <link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="../css/personal.css" rel="stylesheet" type="text/css">

    <script src="../AmazeUI-2.4.2/assets/js/jquery.min.js" type="text/javascript"></script>
    <script src="../AmazeUI-2.4.2/assets/js/amazeui.js" type="text/javascript"></script>

</head>

<body>
<div class="center">
    <div class="col-main">
        <div class="main-wrap">
            <!--标题 -->
            <div class="am-cf am-padding">
                <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">意见反馈</strong> / <small>Suggest</small></div>
            </div>
            <hr/>
            <div class="suggestmain">
                <p>请留下您的宝贵意见：</p>
                <div class="suggestlist">
                    <select data-am-selected>
                        <option value="a" selected>请选择意见类型</option>
                        <option value="b">产品问题</option>
                        <option value="c">促销问题</option>
                        <option value="d">支付问题</option>
                        <option value="e">退款问题</option>
                        <option value="f">配送问题</option>
                        <option value="g">售后问题</option>
                        <option value="h">发票问题</option>
                        <option value="o">退换货</option>
                        <option value="m">其他</option>
                    </select>
                </div>
                <div class="suggestDetail">
                    <p>描述问题：</p>
                    <blockquote class="textArea">
                        <textarea name="opinionContent" id="say_some" cols="60" rows="5" autocomplete="off" placeholder="在此描述您的意见具体内容"></textarea>
                        <div class="fontTip"><i class="cur">0</i> / <i>200</i></div>
                    </blockquote>
                </div>
                <div class="am-btn am-btn-danger anniu">提交</div>
                <p class="suggestTel"><i class="am-icon-phone"></i>客服电话：400-007-1234</p>
            </div>
        </div>
    </div>

</div>

</body>

</html>