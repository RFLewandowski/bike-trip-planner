package gov.nwo.biketripplanner.domain;

public class DummyMailToSend extends Mail {
    public DummyMailToSend(String to, String cc, String subject, String message) {
        super(to, cc, subject, message);
    }

    public DummyMailToSend(String to, String subject, String message) {
        super(to, subject, message);
    }
}
