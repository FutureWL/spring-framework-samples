package io.github.futurewl.site;

public class LogoutEvent extends AuthenticationEvent {
    public LogoutEvent(String username) {
        super(username);
    }
}
