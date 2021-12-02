package FinalExam.FinalExam_04;

import java.util.*;

public class HeroesOfCodeAndLogic7_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfHeroes = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> hitPoints = new TreeMap<>();
        Map<String, Integer> manaPoints = new TreeMap<>();

        for (int i = 0; i < countOfHeroes; i++) {
            String heroInfo = scanner.nextLine();
            String heroName = heroInfo.split(" ")[0];
            Integer hitPoint = Integer.parseInt(heroInfo.split(" ")[1]);
            Integer manaPoint = Integer.parseInt(heroInfo.split(" ")[2]);
            hitPoints.put(heroName, hitPoint);
            manaPoints.put(heroName, manaPoint);
        }
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split(" - ");
            String command = tokens[0];
            String heroName = tokens[1];

            switch (command) {
                case "CastSpell":
                    int manaPointsNeed = Integer.parseInt(tokens[2]);
                    String spellName = tokens[3];

                    if (manaPoints.get(heroName) >= manaPointsNeed) {
                        manaPoints.put(heroName, manaPoints.get(heroName) - manaPointsNeed);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",
                                heroName, spellName, manaPoints.get(heroName));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];

                    hitPoints.put(heroName, hitPoints.get(heroName) - damage);

                    if (hitPoints.get(heroName) > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                heroName, damage, attacker, hitPoints.get(heroName));
                    } else {
                        hitPoints.remove(heroName);
                        manaPoints.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    }
                    break;
                case "Recharge":
                    int amountMana = Integer.parseInt(tokens[2]);
                    int currentMana = manaPoints.get(heroName);
                    int manaRecover = amountMana;
                    manaPoints.put(heroName, manaPoints.get(heroName) + amountMana);

                    if (manaPoints.get(heroName) >= 200) {
                        manaPoints.put(heroName, 200);
                        manaRecover = 200 - currentMana;
                    }
                    System.out.printf("%s recharged for %d MP!%n", heroName, manaRecover);
                    break;
                case "Heal":
                    int amountHit = Integer.parseInt(tokens[2]);
                    int hitRecover = amountHit;
                    int currentHit = hitPoints.get(heroName);
                    hitPoints.put(heroName, hitPoints.get(heroName) + amountHit);

                    if (hitPoints.get(heroName) >= 100) {
                        hitPoints.put(heroName, 100);
                        hitRecover = 100 - currentHit;
                    }
                    System.out.printf("%s healed for %d HP!%n", heroName, hitRecover);
            }
            input = scanner.nextLine();
        }
        hitPoints.entrySet().stream().sorted((hp1, hp2) -> {
            int result = hp2.getValue() - hp1.getValue();
            if (result == 0) {
                result = hp1.getKey().compareTo(hp2.getKey());
            }
            return result;
        }).forEach(hero -> {
            System.out.printf("%s%n HP: %d%n MP: %d%n", hero.getKey(), hero.getValue(), manaPoints.get(hero.getKey()));
        });
    }
}
