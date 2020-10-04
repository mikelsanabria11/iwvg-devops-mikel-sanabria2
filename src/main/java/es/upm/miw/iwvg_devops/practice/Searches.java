package es.upm.miw.iwvg_devops.practice;

import org.apache.logging.log4j.LogManager;

import java.util.stream.Stream;

public class Searches {

    public Fraction findFractionAdditionByUserId(String id) {
        return new UsersDatabase().findAll()
                .filter(user -> user.getId().equals(id))
                .flatMap(user -> user.getFractions().stream())
                .reduce(new Fraction(0,1), (fraction,nextFraction) -> {
                    if(fraction != null && nextFraction != null){
                        return fraction.add(nextFraction);
                    }
                    return null;
                });
    }

    public Stream<Double> findDecimalFractionByUserName(String name) {
        return new UsersDatabase().findAll()
                .filter(user -> user.getName().equals(name))
                .flatMap(user -> user.getFractions().stream())
                .map(Fraction::decimal);
    }

    public Fraction findFractionDivisionByUserId(String id) {
        return new UsersDatabase().findAll()
                .filter(user -> user.getId().equals(id))
                .flatMap(user -> user.getFractions().stream())
                .reduce(Fraction::divide).orElse(new Fraction(0,0));
    }

}
