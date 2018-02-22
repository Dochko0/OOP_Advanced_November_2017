import interfaces.Target;
import interfaces.Weapon;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class HeroTests {

    private static final int TARGET_RETURN_HEALTH=5;
    private static final int TARGET_GIVES_EXPERIENCE = 5;
    private static final int WEAPON_ATTACK_POINTS = 1;
    private static final int WEAPON_DURABILITY_POITS = 2;
    public static final int EXPECTED_HERO_EXP = 5;
    public static final String WRONG_HERO_EXP = "Wrong hero exp!";

    @Test
    public void heroGainsExperianceWhenAttack(){

        Target target = Mockito.mock(Target.class);

        Mockito.when(target.isDead()).thenReturn(true);
        Mockito.when(target.giveExperience()).thenReturn(TARGET_GIVES_EXPERIENCE);


        Weapon weapon = Mockito.mock(Weapon.class);

        Mockito.when(weapon.getAttackPoints()).thenReturn(WEAPON_ATTACK_POINTS);
        Mockito.when(weapon.getDurabilityPoints()).thenReturn(WEAPON_DURABILITY_POITS);
//        Target target = new Target() {
//            public int getHealth() {
//                return TARGET_RETURN_HEALTH;
//            }
//
//            public void takeAttack(int attackPoints) {
//
//            }
//
//            public int giveExperience() {
//                return TARGET_GIVES_EXPERIENCE;
//            }
//
//            public boolean isDead() {
//                return true;
//            }
//        };
//        Weapon weapon= new Weapon() {
//            public int getAttackPoints() {
//                return WEAPON_ATTACK_POINTS;
//            }
//
//            public int getDurabilityPoints() {
//                return WEAPON_DURABILITY_POITS;
//            }
//
//            public void attack(Target target) {
//
//            }
//        };

        Hero hero = new Hero("Stamat", weapon);
                hero.attack(target);

        Assert.assertEquals(WRONG_HERO_EXP,EXPECTED_HERO_EXP,hero.getExperience());
    }
}
