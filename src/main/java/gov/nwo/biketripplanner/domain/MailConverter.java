package gov.nwo.biketripplanner.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MailConverter {

    public MimeMessagePreparator convertToMimeMessage(Mail source) {
        return mimeMessage -> {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
            messageHelper.setTo(source.getTo());
            messageHelper.setSubject(source.getSubject());
            messageHelper.setText(source.getMessage(), true);

            //to build and set html mail
            //dailySummaryText = mailCreatorService.buildTrelloCardEmail(source.getMessage());
            //trelloCardText = mailCreatorService.buildDailySummaryEmail(source.getMessage());
            //setTextPerRequiredMailType(source, messageHelper);
        };
    }
}
