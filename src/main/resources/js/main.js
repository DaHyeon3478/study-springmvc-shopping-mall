$(function(){
    
/*      메인 슬라이드 배너        */
    
    var container = $('#visual .bannerSlide'),
        slideGroup = container.find('.slideshow_slides'),
        slides = slideGroup.find('a'),
        nav = container.find('.slideshow_nav'),
        indicator =container.find('.slideshow_indicator'),
        slideCount = slides.length,
        indicatorHtml = '',
        currentIndex = 0,
        duration = 500,
        easing = 'easeInOutExpo',
        interval = 3500,
        timer;
            
    //슬라이드 이미지 가로로 펼쳐놓기
    slides.each(function(i){
        var newLeft = i * 100 + '%';
        $(this).css({left:newLeft});
        //인디케이터 추가
        indicatorHtml += '<a href="">' + (i+1) + '</a>';
    });

    indicator.html(indicatorHtml);
            
    //슬라이드 이동함수
    function goToSlide(index){
        slideGroup.animate({left: -100*index + '%'}, duration, easing);
        currentIndex = index;
        updateNav();
    }
            
    //첫이미지, 마지막이미지 검사
    function updateNav(){
        var navPrev = nav.find('.prev'),
            navNext = nav.find('.next');
                
        //prev버튼 숨기기
        if(currentIndex == 0){
            navPrev.addClass('disabled');
            //next버튼 우측으로 보내기
            nav.css('justify-content','flex-end');
        } else {
            navPrev.removeClass('disabled');
            nav.css('justify-content','space-between');
        }
                
        //next버튼 숨기기
        if(currentIndex == slideCount-1){
            navNext.addClass('disabled');
        } else {
            navNext.removeClass('disabled');
        }
                
        //인디케이터 색상 현재이미지
        indicator.find('a').removeClass('active');
        indicator.find('a').eq(currentIndex).addClass('active');
    }
            
    //인디케이터 설정
    indicator.find('a').click(function(e){
        e.preventDefault(); //링크 클릭했을 때 페이지이동 방지
        var idx = $(this).index();
        goToSlide(idx);
    });
            
    //좌우 버튼으로 이동하기
    nav.find('a').click(function(e){
        e.preventDefault();
                
        if($(this).hasClass('prev')) {
            goToSlide(currentIndex - 1);
        } else {
            goToSlide(currentIndex + 1);
        }
    });
            
    updateNav(); //첫이미지 버튼처리
            
    //자동 슬라이드 함수
    function startTimer(){
        timer = setInterval(function(){
            var nextIndex = (currentIndex + 1) % slideCount;
            goToSlide(nextIndex);
        }, interval);
    }
            
    startTimer();
            
    function stopTimer(){
        clearInterval(timer);
    }
            
    container.mouseenter(function(){
        stopTimer();
            })
    .mouseleave(function(){
        startTimer();
    });
            
/*      4단배너        */
    
    var fduration = 200,
        fourImg = $('#visual .bannerFour li');
            
        fourImg.stop().mouseover(function(){
            $(this).stop().animate({opacity:0.7},fduration);
        })
        .mouseout(function(){
            $(this).stop().animate({opacity:1},fduration);
        });

    
/*      우측네비       */
    
    $('#visual .rightNav').css('display','none');
    $('#header .headerLogo').mouseover(function(){
        $('#visual .rightNav').css('display','block');
    });
});