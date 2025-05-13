package com.desingpattern.DesignPatternsBehavior.ChainOfResponsability.abstractClass;

public abstract class HandlerSubsidy {
    protected HandlerSubsidy handlerSubsidy;
    protected String extremePoverty[] = { "a1", "a2", "a3", "a4" };
    protected String moderatePoverry[] = { "b1", "b2", "b3", "b4" };
    protected String moderate[] = { "c1", "c2" };

    public void filterSubsidy(HandlerSubsidy handlerSubsidy) {
        this.handlerSubsidy = handlerSubsidy;
    }

    public abstract void filter(String sisben, String message);
}
