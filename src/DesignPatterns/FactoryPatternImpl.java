package DesignPatterns;

public non-sealed class FactoryPatternImpl extends FactoryPattern {

    public FactoryPatternImpl(String stringIdAbstract, Boolean isHourlyFlag, String stringIdAbstract1,
                              Integer numFlags) {
        //input: create a new employee with a given id
        super(stringIdAbstract, isHourlyFlag, stringIdAbstract1, numFlags);
        //TODO: do something with
        //process values, like a  real factory

    }
}
