package tk.taroninak.cafe.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorDto {
    @JsonProperty("message")
    private String message;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("code")
    private String code;


    public ErrorDto() {
        this.message = "Something went wrong!";
        this.reason = "Unknown reason";
        this.code = "u_0";
    }

    public ErrorDto(String message, String reason, String code) {
        this.message = message;
        this.reason = reason;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ErrorDto{" +
                "message='" + message + '\'' +
                ", reason='" + reason + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
