import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String houseGoT = null;
        String coatOfArms = null;
        String words = null;
        String home = null;
        String familyHead = null;

        System.out.print("Choose one of the Great Houses from Game of Thrones," +
                "\n(Tully, Stark, Targaryen, Tyrell, Baratheon, Bolton, Lannister): ");
        houseGoT = console.nextLine();

        switch (houseGoT) {
            case "Stark":
                coatOfArms = "Per base white & green, a grey direwolf's head contourny";
                words = "\"Winter Is Coming\"";
                home = "Winterfell";
                familyHead = "Sansa Stark";
                break;
            case "Targaryen":
                coatOfArms = "A red three-headed dragon on black";
                words = "Fire and Blood";
                home = "Dragonstone";
                familyHead = "Aegon Targaryen aka Jon Snow";
                break;
            case "Lannister":
                coatOfArms = "A roaring lion, gold on crimson";
                words = "\"Hear Me Roar\"";
                home = "Casterly Rock";
                familyHead = "Tyrion Lannister";
                break;
            case "Bolton":
                coatOfArms = "A red flayed man hanging upside-down on a white X-shaped cross on black";
                words = "\"Our Blades Are Sharp\"";
                home = "Dreadfort";
                familyHead = "extinct";
                break;
            case "Tyrell":
                coatOfArms = "A golden rose on green";
                words = "\"Growing Strong\"";
                home = "Highgarden";
                familyHead = "extinct";
                break;
            case "Tully":
                coatOfArms = "A leaping trout, silver, over a wavy white-blue-white fess on per fess mud red and blue";
                words = "\"Family, Duty, Honor\"";
                home = "Riverrun";
                familyHead = "Edmure Tully";
                break;
            case "Baratheon":
                coatOfArms = "A crowned stag black on a golden field";
                words = "\"Ours is the Fury\"";
                home = "Storm's End";
                familyHead = "Gendry Baratheon";
                break;
        }
        System.out.printf("House %s:" +
                        "\n\tWORDS: %s" +
                        "\n\tBANNER: %s" +
                        "\n\tHOMELAND: %s" +
                        "\n\tFAMILY HEAD (unless otherwise extinct): %s",
                        houseGoT, words, coatOfArms, home, familyHead);
        console.close();
    }
}
