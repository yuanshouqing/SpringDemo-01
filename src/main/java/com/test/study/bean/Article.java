package com.test.study.bean;

import io.searchbox.annotations.JestId;
import lombok.Data;

/**
 * @author Kindy
 * @Description:
 * @date
 */
@Data
public class Article
{


    @JestId
    private     Integer   id;
    private     String   author;
    private     String   title;
    private     String    content;




}


