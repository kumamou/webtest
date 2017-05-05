/**
 * Created by Administrator on 2017/5/5.
 */
var i=1;
$(function(){
    $(".dy").click(function(){
        var bdhtml=window.document.body.innerHTML;
        alert(bdhtml);
            $("#show").html(bdhtml);
            $("#show").jqprint();
            $("#show").show();
    })

    $("div").delegate(".sj","click",function(){

        alert(i);
        i++;
    })
})