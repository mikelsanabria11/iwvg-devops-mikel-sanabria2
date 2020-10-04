package es.upm.miw.iwvg_devops.practice;

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
}
