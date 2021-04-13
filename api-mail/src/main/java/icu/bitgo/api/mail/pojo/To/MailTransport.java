package icu.bitgo.api.mail.pojo.To;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.Accessors;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@NonNull
public class MailTransport {
    private Map<String,String> params;
    private String to;
    private String subject;
    private String template;
}
