package com.bd.youdao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Youdao {
    //翻译结果发音地址翻译成功一定存在，需要应用绑定语音合成实例才能正常播放
    private String tSpeakUrl;
    //单词校验后的结果主要校验字母大小写、单词前含符号、中文简繁体
    private List<String> returnPhrase;
    // 词义网络释义该结果不一定存在
    private List<Web> web;
    //源语言	查询正确时，一定存在
    private String query;
    //翻译结果查询正确时，一定存在
    private List<String> translation;
    //错误返回码	一定存在
    private String errorCode;
    //词典deeplink查询语种为支持语言存在
    private Dict dict;
    //webdeeplink查询语种为支持语言时，存在
    private Webdict webdict;
    //词义基本词典，查词时才有
    private Basic basic;
    //源语言和目标语言	一定存在
    private String l;
    //源语言发音地址	翻译成功一定存在，需要应用绑定语音合成实例才能正常播放
    private String speakUrl;









}
