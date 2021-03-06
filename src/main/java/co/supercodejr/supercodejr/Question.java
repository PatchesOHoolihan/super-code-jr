package co.supercodejr.supercodejr;

import javax.persistence.*;

@Entity
public class Question {

    @GeneratedValue
    @Id
    private long id;
    private String codeLanguage;
    @Lob
    @Column(length = 100000)
    private String beforeErrorCode;
    @Lob
    @Column(length = 100000)
    private String errorCode;
    @Lob
    @Column
    private String afterErrorCode;
    @Lob
    @Column(length = 100000)
    private String correctedError;
    @Lob
    @Column(length = 100000)
    private String iframeWrong;
    @Lob
    @Column(length = 100000)
    private String iframeCorrect;
    @Lob
    @Column(length = 100000)
    private String codeyStartingDialogue;
    @Lob
    @Column(length = 100000)
    private String codeyEndingDialogue;
    @Lob
    @Column(length = 100000)
    private String hintText;
    @Lob
    @Column(length = 100000)
    private String groundControlBeginningDialogue;
    @Lob
    @Column(length = 100000)
    private String groundControlCompletedDialogue;

    protected Question (){}

    public Question(String codeLanguage, String beforeErrorCode, String errorCode, String afterErrorCode, String correctedError, String iframeWrong, String iframeCorrect, String codeyStartingDialogue, String codeyEndingDialogue, String hintText, String groundControlBeginningDialogue, String groundControlCompletedDialogue) {

        this.codeLanguage = codeLanguage;
        this.beforeErrorCode = beforeErrorCode;
        this.errorCode = errorCode;
        this.afterErrorCode = afterErrorCode;
        this.correctedError = correctedError;
        this.iframeWrong = iframeWrong;
        this.iframeCorrect = iframeCorrect;
        this.codeyStartingDialogue = codeyStartingDialogue;
        this.codeyEndingDialogue = codeyEndingDialogue;
        this.hintText = hintText;
        this.groundControlBeginningDialogue = groundControlBeginningDialogue;
        this.groundControlCompletedDialogue = groundControlCompletedDialogue;
    }

    public long getId() {
        return id;
    }

    public String getCodeLanguage() {
        return codeLanguage;
    }

    public String getCodeyStartingDialogue() {
        return codeyStartingDialogue;
    }

    public String getCorrectedError() {
        return correctedError;
    }

    public String getBeforeErrorCode() {
        return beforeErrorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getAfterErrorCode() {
        return afterErrorCode;
    }

    public String getIframeWrong() {
        return iframeWrong;
    }

    public String getIframeCorrect() {
        return iframeCorrect;
    }

    public String getCodeyEndingDialogue() {
        return codeyEndingDialogue;
    }

    public String getHintText() {
        return hintText;
    }

    public String getGroundControlBeginningDialogue() {
        return groundControlBeginningDialogue;
    }

    public String getGroundControlCompletedDialogue() {
        return groundControlCompletedDialogue;
    }
}
