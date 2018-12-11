package gov.nwo.biketripplanner.scheduler;

import gov.nwo.biketripplanner.config.AdminConfig;
import gov.nwo.biketripplanner.service.email.DummyMailToSend;
import gov.nwo.biketripplanner.service.email.Mail;
import gov.nwo.biketripplanner.service.email.SimpleEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmailScheduler {
    private static final String SUBJECT = "Dummy email has just arrived";
    private final SimpleEmailService simpleEmailService;
    private final AdminConfig adminConfig;

    @Autowired
    public EmailScheduler(SimpleEmailService simpleEmailService, AdminConfig adminConfig) {
        this.simpleEmailService = simpleEmailService;
        this.adminConfig = adminConfig;
    }

    //@Scheduled(cron = "0 0 3 * * *") //at 3 o'clock every day
    @Scheduled(fixedDelay = 20000) //every 20s
    public void sendInformationEmail() {
        Mail dummyMail = new DummyMailToSend(
                adminConfig.getAdminMail(),
                SUBJECT,
                "This is only dummy mail;)");
        simpleEmailService.send(dummyMail);
    }

}
