package com.projeto.bootcamp.exceptions;

import com.projeto.bootcamp.util.MessageUtil;
import sun.misc.MessageUtils;

public class NotFoundException extends RuntimeException {

    public NotFoundException(){
        super(MessageUtil.NO_RECORDS_FOUND);
    }
}
