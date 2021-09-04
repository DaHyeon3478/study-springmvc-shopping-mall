jQuery(document).ready(function(){
	var _ = jQuery,
		_body = _('body'),
		_header = _('#header');
	
    //��ü�޴� ����/�ݱ�
    var _btnAllCate = jQuery(".btnAllCate");
    var _allCateClose =jQuery(".allCateClose");
    _btnAllCate.on('click', function(){
        jQuery(".boxAllCate").fadeIn();
    });
    _allCateClose.on('click',function(){
        jQuery(".boxAllCate").fadeOut();
    });
    
    //��ǰ��ȣ �ڸ���
    jQuery(".prd-name a").each(function(){
        var prdNameStr = jQuery(this).text();
        var splitStr = prdNameStr.split('_');
        
        jQuery(this).text(splitStr[1]);
    });
    
    //��,�ϴ� �̵�
    jQuery(".btnScrTop").on('click', function(){
        jQuery("html, body").stop().animate({scrollTop:0},300);
    });
    jQuery(".btnScrBtm").on('click', function(){
        jQuery("html, body").stop().animate({ scrollTop:jQuery(document).height() },300);
    });
    
    jQuery('.topBnSlide').slick({
        autoplay: true,
        arrows: false,
        dots: false,
        fade: true,
        cssEase: 'ease-out'
    })
    
    // lang - header
	var lang = {		
		ko : {}
	};
	lang.ko = {
		lang_made : '��ü����'
	};
	// lang_ class�� ã�Ƽ� ��� ��ȯ
	!function(){
		var _this, totalTxt = '';
		for(var i in lang.ko){
			_this = lang.ko[i];
			console.log(_header.find(i))
			totalTxt = '<span class="langKo ' + i + '">' + _this + '</span>';
			_header.find('.' + i).after(totalTxt);
		}		
	}();

    
    
});

jQuery(window).scroll(function(){
    //��� ����
    var _scrollTop = jQuery(window).scrollTop(),
        _hdFix = jQuery(".headerNav"),
        _btnAllCate = jQuery(".allCateBtns"),
        _rightMenu = jQuery(".rightNav"),
        _hdTop1 = jQuery(".headerTop").height();
        _hdTop2 = jQuery(".headerLogo").height();
		_hdTop = _hdTop1 + _hdTop2;
    if ( _scrollTop > _hdTop ) {
        _hdFix.addClass("fix");
        _btnAllCate.find(".btnAllCateTxt").hide();
        _btnAllCate.find(".allCateLogo").fadeIn();
    } else {
        _hdFix.removeClass("fix");
        _btnAllCate.find(".btnAllCateTxt").fadeIn();
        _btnAllCate.find(".allCateLogo").hide();
    }
    
    if ( jQuery("#mainSpot").length > 0 ) {
       if ( _scrollTop > 800 ) { 
            _rightMenu.fadeIn();
        } else {
            _rightMenu.fadeOut();
        }
    } else {
        if ( _scrollTop > _hdTop ) { 
            _rightMenu.fadeIn();
        } else {
            _rightMenu.fadeOut();
        }
    }
});