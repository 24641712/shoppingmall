<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <title>首页</title>
    <link href="../AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="../AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />

    <link href="../basic/css/demo.css" rel="stylesheet" type="text/css" />

    <link href="../css/hmstyle.css" rel="stylesheet" type="text/css" />
    <script src="../AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="../AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>

</head>

<body>
<div>
<div class="hmtop" style="border: #ff253b solid 1px;width: 1300px;float: left;">
    <!--顶部导航条 -->
    <div class="am-container header">
        <ul class="message-l">
            <div class="topMessage">
                <div class="menu-hd">
                    <a href="/user/login" target="_top" class="h">亲，请登录</a>
                    <a href="/user/register" target="_top">免费注册</a>
                </div>
            </div>
        </ul>
        <ul class="message-r">
            <div class="topMessage home">
                <div class="menu-hd"><a href="/shopping/home" target="_top" class="h">商城首页</a></div>
            </div>
            <div class="topMessage my-shangcheng">
                <div class="menu-hd MyShangcheng"><a href="/shopping/frame" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
            </div>
            <div class="topMessage mini-cart">
                <div class="menu-hd"><a id="mc-menu-hd" href="/shopping/shopcart" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">3</strong></a></div>
            </div>
            <div class="topMessage favorite">
                <div class="menu-hd"><a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
        </ul>
    </div>

    <!--悬浮搜索框-->
    <div class="nav white">
        <div class="logo"><img src="../images/logo.png" /></div>
        <div class="logoBig">
            <li><img src="../images/logobig.png" /></li>
        </div>

        <div class="search-bar pr">
            <a name="index_none_header_sysc" href="#"></a>
            <form>
                <input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
                <input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
            </form>
        </div>
    </div>

    <div class="clear"></div>
</div>

<#--<b class="line"></b>-->
<div class="shopNav" style="border: #0f9ae0 solid 1px;float: left;width: 1300px">
    <div class="slideall" style="height: auto;">

        <div class="long-title"><span class="all-goods">全部分类</span></div>
        <div class="nav-cont">
            <ul>
                <li class="index"><a href="#">首页</a></li>
                <li class="qc"><a href="#">闪购</a></li>
                <li class="qc"><a href="#">限时抢</a></li>
                <li class="qc"><a href="#">团购</a></li>
                <li class="qc last"><a href="#">大包装</a></li>
            </ul>
            <div class="nav-extra">
                <i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
                <i class="am-icon-angle-right" style="padding-left: 10px;"></i>
            </div>
        </div>

    </div>

    <script type="text/javascript">
        if ($(window).width() < 640) {
            function autoScroll(obj) {
                $(obj).find("ul").animate({
                    marginTop: "-39px"
                }, 500, function() {
                    $(this).css({
                        marginTop: "0px"
                    }).find("li:first").appendTo(this);
                })
            }
            $(function() {
                setInterval('autoScroll(".demo")', 3000);
            })
        }
    </script>
</div>


<#--<!--引导 &ndash;&gt;-->
<#--<div class="navCir">-->
    <#--<li class="active"><a href="home2.html"><i class="am-icon-home "></i>首页</a></li>-->
    <#--<li><a href="sort.html"><i class="am-icon-list"></i>分类</a></li>-->
    <#--<li><a href="shopcart.html"><i class="am-icon-shopping-basket"></i>购物车</a></li>-->
    <#--<li><a href="../person/index.html"><i class="am-icon-user"></i>我的</a></li>-->
<#--</div>-->
<div style="margin-top: -0px">
　  <iframe id="menuFrame" name="menuFrame" src="/shopping/sidebar"
       style="overflow: visible;margin-left: 0px" scrolling="yes" frameborder="no"
       height="560px" width="100%"></iframe>
</div>
</div><#--整个部分-->
<script>
    window.jQuery || document.write('<script src="../basic/js/jquery.min.js "><\/script>');
</script>
<script type="text/javascript " src="../basic/js/quick_links.js "></script>
<script type="text/javascript " src="../js/test.js "></script>

<#--<script type="text/javascript">-->
    <#--$(document).ready(function(){-->
        <#--alert()-->
        <#--$(".tip").append("./shopping/sidebar.ftl");-->

    <#--}-->

<#--</script>-->
</body>

</html>