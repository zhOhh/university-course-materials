window.addEventListener('load', function () {

    // 获取当前日期

    function getNowDate() {
        var now = new Date()//获取系统当前时间
        var year = now.getFullYear()//得到年份
        var month = now.getMonth() + 1//得到月份
        var date = now.getDate()//得到日期
        var now = year + '-' + month + '-' + date
        return now
    }

    document.getElementById('date1').innerHTML = getNowDate()
    document.getElementById('date2').innerHTML = getNowDate()
    document.getElementById('date3').innerHTML = getNowDate()
    document.getElementById('date4').innerHTML = getNowDate()
    document.getElementById('date5').innerHTML = getNowDate()
    document.getElementById('date6').innerHTML = getNowDate()
    document.getElementById('date7').innerHTML = getNowDate()
    document.getElementById('date8').innerHTML = getNowDate()


    // 轮播图

    //1. 获取元素
    var prev = document.querySelector('.prev');
    var next = document.querySelector('.next');
    var banners = document.querySelector('.banners')

    //2. 鼠标经过，显示左右按钮
    banners.addEventListener('mouseenter', function () {
        prev.style.display = 'block';
        next.style.display = 'block';
        clearInterval(timer);
        timer = null;//清除计时器
    });

    //3. 鼠标离开，隐藏左右按钮
    banners.addEventListener('mouseleave', function () {

        prev.style.display = 'none';
        next.style.display = 'none';

        timer = setInterval(function () {
            // 轮播图自动切换
            next.click();
        }, 2000);

    });

    // 4. 动态生成小圆圈 有几张图片，就生成几个小圆圈
    var images = document.querySelector('.images');
    var dots = document.querySelector('.dots');
    var banners_width = banners.offsetWidth;

    for (var i = 0; i < images.children.length; i++) {
        var li = document.createElement('li');
        li.setAttribute('index', i);
        dots.appendChild(li);

        //5. 生成小圆圈的同时直接绑定点击事件
        li.addEventListener('click', function () {
            for (var i = 0; i < dots.children.length; i++) {
                dots.children[i].className = '';
            }
            this.className = 'active';

            // 6. 点击小圆圈，移动图片
            var index = this.getAttribute('index');
            num = index;
            circle = index;
            animate(focus, -index * banners_width);
        })

    }
    dots.children[0].className = 'active';
    var first = images.children[0].cloneNode(true);
    images.appendChild(first);

    // 点击右侧按钮，图片滚动一张
    var num = 0;
    var circle = 0;
    next.addEventListener('click', function () {
        // 如果走到了最后复制的一张图片，此时的ul要快速复原 left值改为零
        if (num == images.children.length - 1) {
            images.style.left = 0;
            num = 0;
        }
        num++;
        animate(images, -num * banners_width);
        // 8. 点击右侧按钮，小圆圈跟随一起变化
        circle++;
        if (circle == dots.children.length) {
            circle = 0;
        }
        circleChange();
    })
    //左侧按钮点击事件
    prev.addEventListener('click', function () {
        // 如果走到了最后复制的一张图片，此时的ul要快速复原 left值改为零
        if (num == 0) {
            num = images.children.length - 1;
            images.style.left = -num * banners_width + 'px';
        }
        num--;
        animate(images, -num * banners_width)
        // 8. 点击右侧按钮，小圆圈跟随一起变化
        circle--;
        circle = circle < 0 ? dots.children.length - 1 : circle;
        circleChange();
    })
    function circleChange() {
        for (var i = 0; i < dots.children.length; i++) {
            dots.children[i].className = '';
        }
        dots.children[circle].className = 'active';
    }
    var timer = setInterval(function () {
        next.click();
    }, 2000);

})



function animate(obj, target, callback) {
    //让元素只有一个定时器在执行，需要清除以前的定时器
    clearInterval(obj.timer);
    obj.timer = setInterval(function () {
        var step = (target - obj.offsetLeft) / 10;
        step = step > 0 ? Math.ceil(step) : Math.floor(step);
        if (obj.offsetLeft == target) {
            //停止动画 本质是停止定时器
            clearInterval(obj.timer)
            //回调函数写到定时器结束位置
            if (callback) {
                callback();
            }

        }
        //把每次加1这个步长值改为一个慢慢变小的值
        obj.style.left = obj.offsetLeft + step + 'px';
    }, 15);
}
