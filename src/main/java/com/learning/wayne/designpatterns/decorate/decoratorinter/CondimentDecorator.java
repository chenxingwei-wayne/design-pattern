package com.learning.wayne.designpatterns.decorate.decoratorinter;

import com.learning.wayne.designpatterns.decorate.decoratorinter.beverinter.YinLiao;

public interface CondimentDecorator extends YinLiao {
    String getDescription();
}
