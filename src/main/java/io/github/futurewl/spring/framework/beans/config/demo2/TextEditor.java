package io.github.futurewl.spring.framework.beans.config.demo2;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:19:24
 * @version 1.0
 */
public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
