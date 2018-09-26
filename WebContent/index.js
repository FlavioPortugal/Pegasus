//responsivo
var nav = $(".navbar-toggle");
var ulNav = $(".navbar-collapse");
$(".background").on("click", function(){
  nav.addClass("collapsed");
  nav.attr("aria-expanded","false");
  ulNav.removeClass("in");
  ulNav.attr("aria-expanded","false");
});


var $doc = $('html, body');
$('.clicar').click(function() {
    $doc.animate({
        scrollTop: $( $.attr(this, 'href') ).offset().top
    }, 1000);
    return false;
});
// var l1 = $('.secao-secundaria > a:nth-child(1)')
// l1.on('mouseover', function(){
//     setInterval(function(){
//       $('.effect').css('background-color', '#0878ce');
//
//     }, 1000);
// })

$(".link").on("click", function(){
		$(this).siblings().slideToggle();
})