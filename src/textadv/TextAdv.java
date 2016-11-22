/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textadv;
//<editor-fold defaultstate="collapsed" desc="Code">
import java.awt.Desktop;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Levon Dubois
 */

public class TextAdv extends JFrame{
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static int room =0;
    public static int dig = 0;
    public static int rescue = 6;
    public static int LucarioHealth = 344;
    public static int GalladeHealth = 340;
    public static int GreninjaHealth = 348;
    public static int ArceusHealth = 999999999;
    public static int PokéBall;
    public static int iPhoneFuse = 1;
    public static int poke;
    public static boolean GreninjaBattle;
    public static boolean Greninja = true;
    public static boolean rescueCalled;
    public static boolean trap;
    public static boolean PokéBallTaken;
    public static boolean PokéBall2Taken;
    public static boolean Lucario = true;
    public static boolean sword;
    public static boolean swordTaken;
    public static boolean iPhone;
    public static boolean iPhoneTaken;
    public static boolean iPhoneExplode;
    public static boolean Galaxy;
    public static boolean GalaxyTaken;
    public static boolean wall = true;
    public static boolean chopper;
    public static boolean Arceus = true;
    public static boolean ArceusBattle = false;
    public static boolean ArceusCaught;
    public static boolean Pikachu;
    public static boolean Gallade = true;
    public static boolean GalladeCaught;
    public static boolean GalladeBattle;
    public static boolean DebugMode;
    public static boolean CheatMode;
    public static boolean Mute;
    public static AudioInputStream audioIn = null;
    public static Clip clip;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Music">
    public static void StopMusic(){
       if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
    }
    public static void ArceusBattleMusic() throws LineUnavailableException{
        if (!(Mute)){
        try {
            InputStream url = TextAdv.class.getResourceAsStream("/textadv/Battle_Xerneas_Yveltal.wav");
            audioIn = AudioSystem.getAudioInputStream(url);
            if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
            clip = AudioSystem.getClip();
            clip.open(audioIn);
         clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException ex) {
            System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Open audio clip and load samples from the audio input stream.
        
    }
    }
    public static void WildBattleMusic() throws LineUnavailableException{
        if (!(Mute)){
        try {
            //replace Wild_Pokemon_Battle.wav with your sound file.
            InputStream url = TextAdv.class.getResourceAsStream("/textadv/Wild_Pokemon_Battle.wav");
            audioIn = AudioSystem.getAudioInputStream(url);
            if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
            clip = AudioSystem.getClip();
            clip.open(audioIn);
         clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException ex) {
            System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Open audio clip and load samples from the audio input stream.
        }
    }
    public static void WildBattleMusicAlola() throws LineUnavailableException{
        if (!(Mute)){
        try {
            //replace Wild_Pokemon_Battle.wav with your sound file.
            InputStream url = TextAdv.class.getResourceAsStream("/textadv/Wild_Pokemon_Battle_Alola.wav");
            audioIn = AudioSystem.getAudioInputStream(url);
            if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
            clip = AudioSystem.getClip();
            clip.open(audioIn);
         clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException ex) {
            System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Open audio clip and load samples from the audio input stream.
        }
    }
    public static void TrainerBattleMusic() throws LineUnavailableException{
        if (!(Mute)){
        try {
            //replace Wild_Pokemon_Battle.wav with your sound file.
            InputStream url = TextAdv.class.getResourceAsStream("/textadv/Trainer_Battle_XY.wav");
            audioIn = AudioSystem.getAudioInputStream(url);
            if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
            clip = AudioSystem.getClip();
            clip.open(audioIn);
         clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException ex) {
            System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Open audio clip and load samples from the audio input stream.
        }
    }
    public static void TrainerBattleMusicAlola() throws LineUnavailableException{
        if (!(Mute)){
        try {
            //replace Wild_Pokemon_Battle.wav with your sound file.
            InputStream url = TextAdv.class.getResourceAsStream("/textadv/Trainer_Battle_Alola.wav");
            audioIn = AudioSystem.getAudioInputStream(url);
            if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
            clip = AudioSystem.getClip();
            clip.open(audioIn);
         clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException ex) {
            System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Open audio clip and load samples from the audio input stream.
        }
    }
    public static void PokèHeal() throws LineUnavailableException{
        //AudioInputStream audioIn = null;
        if (!(Mute)){
        try {
            InputStream url = TextAdv.class.getResourceAsStream("/textadv/Pokemon_Healed_XY.wav");
            audioIn = AudioSystem.getAudioInputStream(url);
            if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
            clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
        } catch (UnsupportedAudioFileException | IOException ex) {
            System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                audioIn.close();
            } catch (IOException ex) {
                Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            }
        }
    }
    }
    public static void PokèHealAlola() throws LineUnavailableException{
        //AudioInputStream audioIn = null;
        if (!(Mute)){
        try {
            InputStream url = TextAdv.class.getResourceAsStream("/textadv/Pokemon_Healed_Alola.wav");
            audioIn = AudioSystem.getAudioInputStream(url);
            if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
            clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
        } catch (UnsupportedAudioFileException | IOException ex) {
            System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                audioIn.close();
            } catch (IOException ex) {
                Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            }
        }
    }
    }
    public static void PokèCatch() throws LineUnavailableException{
        //AudioInputStream audioIn = null;
        if (!(Mute)){
        try {
            InputStream url = TextAdv.class.getResourceAsStream("/textadv/Pokemon_Evolved.wav");
            audioIn = AudioSystem.getAudioInputStream(url);
            if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
            clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
        } catch (UnsupportedAudioFileException | IOException ex) {
            System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                audioIn.close();
            } catch (IOException ex) {
                Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            }
        }
    }
    }
    public static void PokèCatchAlola() throws LineUnavailableException{
        //AudioInputStream audioIn = null;
        if (!(Mute)){
        try {
            InputStream url = TextAdv.class.getResourceAsStream("/textadv/PokeCatch_Alola.wav");
            audioIn = AudioSystem.getAudioInputStream(url);
            if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
            clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
        } catch (UnsupportedAudioFileException | IOException ex) {
            System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                audioIn.close();
            } catch (IOException ex) {
                Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            }
        }
    }
    }
    public static void KeyItemGet() throws LineUnavailableException{
        //AudioInputStream audioIn = null;
        if (!(Mute)){
        try {
            InputStream url = TextAdv.class.getResourceAsStream("/textadv/Obtained_A_Key_Item_XY.wav");
            audioIn = AudioSystem.getAudioInputStream(url);
            if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
            clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
        } catch (UnsupportedAudioFileException | IOException ex) {
            System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                audioIn.close();
            } catch (IOException ex) {
                Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            }
        }
    }
    }
    public static void KeyItemGetAlola() throws LineUnavailableException{
        //AudioInputStream audioIn = null;
        if (!(Mute)){
        try {
            InputStream url = TextAdv.class.getResourceAsStream("/textadv/Item_Get_Alola.wav");
            audioIn = AudioSystem.getAudioInputStream(url);
            if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
            clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
        } catch (UnsupportedAudioFileException | IOException ex) {
            System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                audioIn.close();
            } catch (IOException ex) {
                Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            }
        }
    }
    }
    public static void Charging() throws LineUnavailableException{
        if (!(Mute)){
        try {
            InputStream url = TextAdv.class.getResourceAsStream("/textadv/iOS 7 Battery Charging Sound Effect.wav");
            audioIn = AudioSystem.getAudioInputStream(url);
            //String bip = "src\\textadv\\Pokemon_Evolved.wav";
            if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
            clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
        } catch (UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
        } finally {
            try {
                audioIn.close();
            } catch (IOException ex) {
                Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ANSI_RED+"CRITICAL ERROR: Audio failed to play.\nPlease report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
            }
        }
    }
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Rooms">
    public static void StartRoom(){
        room = 0;
        System.out.println("House");
        System.out.println("A dimly lit house with no doors.\nThere is a wall towards your west and south.");
        if (iPhone){
            System.out.println("You notice an iPhone charger plugged into the wall.");
        }
    }
    public static void room1(){
        room = 1;
        System.out.println("Field");
        if (Lucario){
            System.out.println("There is a forest to the west. You can see a Pokémon in the distance towards the east but you can't tell what it is.");
            } else {
            System.out.println("There is a forest to the west. You can a great wall towards your north with the word 'TRUMP' printed on it.");
    }
    }
    public static void room2(){
        room = 2;
        System.out.println("Field");
        if ((PokéBallTaken == false)&&(Arceus)){
            System.out.println("You can see a Pokémon in the towards the east but you still have a hard time identifying it.\nThere is a PokéBall on the ground.");
        } else if ((PokéBallTaken)&&(Arceus)){
            System.out.println("You can see a Pokémon in the towards the east but you still have a hard time identifying it.");
        } else {
        System.out.println("You are in an empty field with a wall towards the north.");
    }
    }
    @SuppressWarnings("SleepWhileInLoop")
    public static void room3() throws InterruptedException, LineUnavailableException{
        room = 3;
        Scanner reader = new Scanner(System.in);
        System.out.println("Field");
        if (((Arceus))&&(!(Lucario))){
            ArceusBattleMusic();
            System.out.println("You approach the Pokémon and you discover it is the almighty Arceus.\nYou sent out Lucario!");
            ArceusBattle = true;
            while ((ArceusHealth > 0)&&(ArceusBattle)){
                if (LucarioHealth < 1){
                    Thread.sleep(3000);
                    System.out.println("Lucario fainted!");
                    Thread.sleep(3000);
                    System.out.println("The almighty Arceus used Hyper Beam on you!");
                    Thread.sleep(3000);
        System.out.println("You died!");
        if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
        Death();
                }
            System.out.println("Lucario's Health: "+LucarioHealth+"\nArceus' Health: "+ArceusHealth+"\nWhat move would you like to use against the almighty Arceus? (Aura Sphere, Close Combat, Dark Pulse, Dragon Pulse)");
        String move = reader.nextLine();
        move = move.toLowerCase();
        switch(move){
            case "aura sphere":
                System.out.println("Lucario won't obey!");
                break;
            case "close combat":
                System.out.println("Lucario won't obey!");
                break;
            case "dark pulse":
                System.out.println("Lucario won't obey!");
                break;
            case "dragon pulse":
                System.out.println("Lucario won't obey!");
                break;
            case "run":
                if (DebugMode){
                    System.out.println("You ran from the almighty Arceus!");
                    ArceusBattle = false;
                    StopMusic();
                    break;
                }
                System.out.println("You can't run from the almighty Arceus!");
                break;
            case "pokeball":
                System.out.println("Arceus broke free!\nThe almighty Arceus used Hyper Beam on you!");
                PokéBall--;
                System.out.println("You died!");
                if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
                Death();
                break;
            default:
                System.out.println("Lucario doesn't know that move!");
                break;
        }       Thread.sleep(3000);
        if (ArceusBattle){
                System.out.println("The almighty Arceus used Hyper Beam!");
                LucarioHealth -= 999999;
                Thread.sleep(3000);
                System.out.println("It's a one-hit KO!");
        }
            }
        } else if (((Arceus))&&((Lucario))&&(ArceusBattle)) {
            System.out.println("The almighty Arceus used Hyper Beam on you!");
                    Thread.sleep(3000);
        System.out.println("You died!");
        if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
        Death();
        } else {
            System.out.println("There is a great wall towards your north and east with the word 'TRUMP' printed on it.");
    }
    }
    public static void room4(){
        room = 4;
        System.out.println("Field");
        if ((Arceus)&&(Lucario)){
            System.out.println("There is a Pokémon towards the northeast and southeast.");
        } else if ((Arceus)&&(Lucario == false)&&(iPhoneTaken == false)){
            System.out.println("There is a Pokémon towards the northeast.\nYou notice an iPhone 7 on the ground.");
        } else if ((Arceus == false)&&(Lucario)){
            System.out.println("There is a Pokémon towards the southeast.");
        } else if ((Arceus == false)&&(Lucario == false)&&(iPhoneTaken == false)){
        System.out.println("You are in an field with a house towards the west.\nYou notice an iPhone 7 on the ground.");
        } else if ((Arceus == false)&&(Lucario == false)&&(iPhoneTaken)){
        System.out.println("You are in an field with a house towards the west.");
        }
    }
    @SuppressWarnings("SleepWhileInLoop")
    public static void room5() throws InterruptedException, LineUnavailableException{
        room = 5;
        Scanner reader = new Scanner(System.in);
        System.out.println("Field");
        if ((Arceus)&&(Lucario)){
            System.out.println("There is a Pokémon towards the north and south.");
        } else if (!(Lucario)) {
            if ((!(Lucario))&&(Greninja)){
            TrainerBattleMusicAlola();
            System.out.println("You bumped into Youngster Joey!");
            Thread.sleep(1000);
                System.out.println("Youngster Joey sent out Greninja!");
                Thread.sleep(1000);
                System.out.println("You sent out Lucario!");
            GreninjaBattle = true;
            while ((GreninjaHealth > 0)&&(LucarioHealth > 0)&&(Greninja)){
            System.out.println("Lucario's Health: "+LucarioHealth+"\nGreninja's Health: "+GreninjaHealth+"\nWhat move would you like to use against Greninja? (Aura Sphere, Close Combat, Dark Pulse, Dragon Pulse)");
        String move = reader.nextLine();
        move = move.toLowerCase();
        switch(move){
            case "aura sphere":
                System.out.println("Lucario used Aura Sphere!");
                Thread.sleep(3000);
                System.out.println("It's super effective!");
                GreninjaHealth -= 100;
                break;
            case "close combat":
                System.out.println("Lucario used Close Combat!");
                Thread.sleep(3000);
                System.out.println("It's super effective!");
                GreninjaHealth -= 120;
                break;
            case "dark pulse":
                System.out.println("Lucario used Dark Pulse!");
                Thread.sleep(3000);
                System.out.println("It's not very effective...");
                GreninjaHealth -= 40;
                break;
            case "dragon pulse":
                System.out.println("Lucario used Dragon Pulse!");
                Thread.sleep(3000);
                GreninjaHealth -= 85;
                break;
            case "run":
                System.out.println("You can't run from a trainer battle!");
                break;
            case "pokeball":
                if (PokéBall != 0){
                PokéBall--;
                Thread.sleep(3000);
                System.out.println("The trainer blocked the ball!");
                Thread.sleep(3000);
                System.out.println("Don't be a thief!");
                Thread.sleep(3000);
                } else {
                    System.out.println("You dont have a PokéBall!");
                }
                break;
            default:
                System.out.println("Lucario doesn't know that move!");
                break;
        }if (GreninjaHealth < 1){
                System.out.println("Greninja fainted!");
            System.out.println("You defeated Youngster Joey!");
            GreninjaBattle = false;
            if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
            Greninja = false;
            }
        if (GreninjaBattle){
            if (!(DebugMode)){
        int grmove = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                switch(grmove){
            case 1:
                System.out.println("Greninja used Hyrdro Pump!");
                LucarioHealth -= 120;
                break;
            case 2:
                System.out.println("Greninja used Water Shuriken!");
                LucarioHealth -= 140;
                break;
            case 3:
                System.out.println("Greninja used Rock Smash!");
                Thread.sleep(500);
                System.out.println("It's super effective!");
                LucarioHealth -= 180;
                break;
            case 4:
                System.out.println("Greninja used Lick!");
                LucarioHealth -= 80;
                break;
            default:
                System.out.println(ANSI_RED+"CRITICAL ERROR: Greninja's RNG has returned an illegal value. Please report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
                break;
                }
        } else if (DebugMode){
            int grmove = ThreadLocalRandom.current().nextInt(2, 4 + 1);
                switch(grmove){
            case 1:
                System.out.println("Greninja used Hyrdro Pump!");
                LucarioHealth -= 120;
                break;
            case 2:
                System.out.println("Greninja used Water Shuriken!");
                LucarioHealth -= 140;
                break;
            case 3:
                System.out.println("Greninja used Rock Smash!");
                Thread.sleep(500);
                System.out.println("It's super effective!");
                LucarioHealth -= 180;
                break;
            case 4:
                System.out.println("Greninja used Lick!");
                LucarioHealth -= 80;
                break;
            default:
                System.out.println(ANSI_RED+"CRITICAL ERROR: Greninja's RNG has returned an illegal value. Please report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
                break;
                }
        }
            }
        if (LucarioHealth < 1){
                    System.out.println("Lucario fainted!\nGreninja used Water Shuriken on you!");
        System.out.println("You died!");
        if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
        Death();
        break;
                }
            } if (GreninjaHealth < 1){
            //System.out.println("You defeated Youngster Joey!");
            if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
            Greninja = false;
            }
        }else if ((Arceus)&&(Lucario == false)){
            System.out.println("There is a Pokémon towards the north.");
        } else if ((Arceus == false)&&(Lucario)){
            System.out.println("There is a Pokémon towards the south.");
        } else {
            if (rescue == 0){
            System.out.println("The chopper has is towards the southwest!");
        } else {
        System.out.println("There is a great wall towards your east with the word 'TRUMP' printed on it.");
    }
        }
        }
    }
    public static void room6() throws InterruptedException, LineUnavailableException{
        room = 6;
        Scanner reader = new Scanner(System.in);
        System.out.println("Field");
        if (Lucario){
            WildBattleMusicAlola();
            System.out.println("You approach the Pokémon and you discover it is an angry Lucario.");
            if (PokéBall != 0){
            System.out.println("Would you like to use a PokéBall to catch the Lucario? (yes/no)");
            String command = reader.nextLine();
            command = command.toLowerCase();
            if (command.equals("yes")){
                PokéBall--;
                Thread.sleep(3000);
                System.out.println("*shake*");
                Thread.sleep(3000);
                System.out.println("*shake*");
                Thread.sleep(3000);
                System.out.println("*shake*");
                Thread.sleep(6000);
                System.out.println("*click*");
                Thread.sleep(1000);
                System.out.println("Gotcha! Lucario was caught!");
                PokèCatchAlola();
                Lucario = false;
            } else {
                System.out.println("The wild Lucario used Aura Sphere on you!");
            System.out.println("You died!");
            if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
            Death();
            }
        } else {
        System.out.println("The wild Lucario used Aura Sphere on you!");
        System.out.println("You died!");
        if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
        Death();
        }
        
        } else {
        System.out.println("There is a great wall towards your south and east with the word 'TRUMP' printed on it.");
    }
    }
    public static void room7(){
        room = 7;
        System.out.println("Field");
        if ((room == 7)&&(rescue == 0)){
            System.out.println("The chopper is here! Get on board!");
        } else if (Lucario){
        System.out.println("There is a Pokèmon towards your east.");
        } else {
        System.out.println("There is a great wall towards your south and west with the word 'TRUMP' printed on it.");
    }
    }
    public static void room8(){
        room = 8;
        System.out.println("Field");
        System.out.println("There is a great wall towards your south and east with the word 'TRUMP' printed on it.");
    }
    public static void room9(){
        room = 9;
        System.out.println("Forest");
        if (rescue == 5){
            System.out.println("You bumped into a Chain Chomp!");
        System.out.println("The Chain Chomp tore your body apart and feasted on your corpse!");
        System.out.println("You died!");
        Death();
        } else {
            if ((PokéBall2Taken == false)&&(Gallade)&&(!(Lucario))){
            System.out.println("You can see a Pokémon in the towards the west but you still have a hard time identifying it.\nThere is a PokéBall on the ground.");
        } else if ((PokéBall2Taken)&&(Gallade)){
            System.out.println("You can see a Pokémon in the towards the west but you still have a hard time identifying it.");
        } else {
        System.out.println("You are in a forest with a wall towards the south.");
        System.out.println("There is a great wall towards your south with the word 'TRUMP' printed on it.");
    }   if (rescueCalled){
        System.out.println("You notice a sword on the ground.");
    }
        }
    }
    @SuppressWarnings("SleepWhileInLoop")
    public static void room10() throws InterruptedException, LineUnavailableException{
        Scanner reader = new Scanner(System.in);
        room = 10;
        System.out.println("Forest");
        if ((!(Lucario))&&(Gallade)){
            WildBattleMusicAlola();
            System.out.println("You bumped into an angry Gallade!\nYou sent out Lucario!");
            GalladeBattle = true;
            while ((GalladeHealth > 0)&&(LucarioHealth > 0)&&(Gallade)){
            System.out.println("Lucario's Health: "+LucarioHealth+"\nGallade's Health: "+GalladeHealth+"\nWhat move would you like to use against the Gallade? (Aura Sphere, Close Combat, Dark Pulse, Dragon Pulse)");
        String move = reader.nextLine();
        move = move.toLowerCase();
        switch(move){
            case "aura sphere":
                System.out.println("Lucario used Aura Sphere!");
                Thread.sleep(3000);
                System.out.println("It's not very effective...");
                GalladeHealth -= 40;
                break;
            case "close combat":
                System.out.println("Lucario used Close Combat!");
                Thread.sleep(3000);
                System.out.println("It's not very effective...");
                GalladeHealth -= 60;
                break;
            case "dark pulse":
                System.out.println("Lucario used Dark Pulse!");
                Thread.sleep(3000);
                System.out.println("It's super effective!");
                GalladeHealth -= 160;
                break;
            case "dragon pulse":
                System.out.println("Lucario used Dragon Pulse!");
                Thread.sleep(3000);
                GalladeHealth -= 85;
                break;
            case "run":
                System.out.println("You ran from battle!");
                GalladeBattle = false;
                room11();
                System.out.println("You ran north!");
                if ((clip != null)&&(clip.isRunning())){
                    clip.stop();
                }
                break;
            case "pokeball":
                if (PokéBall != 0){
                if (GalladeHealth <= 50){
                    PokéBall--;
                Thread.sleep(3000);
                System.out.println("*shake*");
                Thread.sleep(3000);
                System.out.println("*shake*");
                Thread.sleep(3000);
                System.out.println("*shake*");
                Thread.sleep(6000);
                System.out.println("*click*");
                Thread.sleep(1000);
                System.out.println("Gotcha! Gallade was caught!");
                PokèCatchAlola();
                GalladeCaught = true;
                Gallade = false;
                //GalladeHealth = 0;
                } else {
                    System.out.println("The enemy's health must be 50 or below!");
                } 
                } else {
                    System.out.println("You dont have a PokéBall!");
                }
                break;
            default:
                System.out.println("Lucario doesn't know that move!");
                break;
        }
        if ((!(GalladeCaught))&&((GalladeBattle))){
            if (!(DebugMode)){
        int gmove = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                switch(gmove){
            case 1:
                System.out.println("Gallade used Close Combat!");
                System.out.println("It's super effective!");
                LucarioHealth -= 240;
                break;
            case 2:
                System.out.println("Gallade used Focus Blast!");
                System.out.println("It's super effective!");
                LucarioHealth -= 240;
                break;
            case 3:
                System.out.println("Gallade used Psychic!");
                LucarioHealth -= 90;
                break;
            case 4:
                System.out.println("Gallade used Psycho Cut!");
                LucarioHealth -= 70;
                break;
            default:
                System.out.println(ANSI_RED+"CRITICAL ERROR: Gallade's RNG has returned an illegal value. Please report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
                break;
                }
        } else if (DebugMode){
            int gmove = ThreadLocalRandom.current().nextInt(2, 4 + 1);
                switch(gmove){
            case 1:
                System.out.println("Gallade used Close Combat!");
                System.out.println("It's super effective!");
                LucarioHealth -= 240;
                break;
            case 2:
                System.out.println("Gallade used Focus Blast!");
                System.out.println("It's super effective!");
                LucarioHealth -= 240;
                break;
            case 3:
                System.out.println("Gallade used Psychic!");
                LucarioHealth -= 90;
                break;
            case 4:
                System.out.println("Gallade used Psycho Cut!");
                LucarioHealth -= 70;
                break;
            default:
                System.out.println(ANSI_RED+"CRITICAL ERROR: Gallade's RNG has returned an illegal value. Please report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
                break;
                }
        }
            }
        if (LucarioHealth < 1){
                    System.out.println("Lucario fainted!\nGallade used Psycho Cut on you!");
        System.out.println("You died!");
        if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
        Death();
        break;
                }
            } if (GalladeHealth < 1){
            System.out.println("You defeated the wild Gallade!");
            if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
            Gallade = false;
            }
        } else if (!(Gallade)) {
            System.out.println("There is a great wall towards your south with the word 'TRUMP' printed on it.");
        } else {
            System.out.println("You bumped into an angry Gallade!");
        System.out.println("The angry Gallade used Psycho Cut on you!");
        System.out.println("You died!");
        Death();
        }
    }
    public static void room11(){
        room = 11;
        System.out.println("Forest");
        if (rescue == 2){
            System.out.println("You bumped into a Chain Chomp!");
        System.out.println("The Chain Chomp tore your body apart and feasted on your corpse!");
        System.out.println("You died!");
        Death();
        } else {
        System.out.println("There is a river flowing south.");
        System.out.println("There is a great wall towards your west with the word 'TRUMP' printed on it.");
    }
    }
    public static void room12(){
        room = 12;
        System.out.println("Forest");
        if (rescue == 4||rescue == 1){
            System.out.println("You bumped into a Chain Chomp!");
        System.out.println("The Chain Chomp tore your body apart and feasted on your corpse!");
        System.out.println("You died!");
        Death();
        } else {
        System.out.println("Towards your east is a wall with a hole in it.\nYou notice a flag towards the north.");
        }
    }
    public static void room13(){
        room = 13;
        trap = true;
        System.out.println("Forest");
        if (rescue == 3){
            System.out.println("You bumped into a Chain Chomp!");
        System.out.println("The Chain Chomp tore your body apart and feasted on your corpse!");
        System.out.println("You died!");
        Death();
        } else {
        System.out.println("You walk into the forest.");
        System.out.println("You fell into a trap!");
        System.out.println("You can see a flag above you with a big red 'R' printed on it.");
    }
    }
    public static void room14(){
        room = 14;
        System.out.println("Forest");
        System.out.println("There is a river flowing south.");
        if (rescue == 2){
            System.out.println("You bumped into a Chain Chomp!");
        System.out.println("The Chain Chomp tore your body apart and feasted on your corpse!");
        System.out.println("You died!");
        Death();
        } else {
        if (GalaxyTaken){
            
        } else {
            if(iPhoneTaken == false){
                System.out.println("This text is a placeholder to prevent issues with the game and shouldn't be shown under normal circumstances.");
            } else {
        System.out.println("You notice a Samsung Galaxy S7 Edge at the bottom of the river.");
        }
        }
        }
    }
    public static void roomUndefined(){
        room = 999;
        System.out.println("???");
        System.out.println("A mysterious glitch that resembles MissingNo appeared and made you glitch into nothing!");
        System.out.println("d̰̟̺̲̭̙l͖͕̘͉̰̳̖ͣf̧̊̍̽̍ͫ̀ȟ̺͉̉́k͉͑ͨǵ̈́̅ͬ̀̚a̟̺̞ͮs̫̦͙̳̥̦ͯ̂ͯ̓͂ͧ͛ǩ̵̥̊́͊ͨl̙̩̍̍̾d̥̗͇̱̻͔̞̉k̝̠͎͛͒̕f̢̣̫̩͕̗͙͂g͓̮̯̥̮̳̩͗̌̎k͆̋̂ḑ̖̼̥̩̹̥̩ͦͭͤͭͣa̶͐s̢̫̩̥͇͍͉̽ͤͥ̌̑̌ͯk̛̳͔̘̓ͫͅd̻͓̲͇̤͆́k͏̰̘͓s̭̭̫̓ͫ̇̒̒̈́͂ͅǎ̬̰̤͍̼̻̖̔͆̔̐͋́̚d͖̤̜̗̪͊̈́̎͛ͮͫ͒͜j̶̈̓ͫ͛ͮk̮͕ͩ̓͠ͅs̨͒d͗̅ͅŝ̹̺̟̙̗ͬͪ͋ͪ̌ḓ̴̭̳̙̺͇̉̍̏̉̇ͫ");
        System.out.println("d̳̙̽ͧ͐̒̑̃f͉̼͉̼̭͈ͯ͗̿͌̆͝g̋ͫ͢t͚̜̣ͦ̚ḱ҉̳f̤̪̪̼̮̤h̑͆͆҉ǰ̩̎ͭͤ͠j͓̰͇̗̼̫̮̎́̌f̽̔͐́ͨ̉ͤ ̗͍͍̺̬̳̻̋̽k̺̳̫ͫ͂̾͐̓ͅt͈̲̖̳̗͖̠̃͢j̺̺̫̯̤̗̖̄͋̐͋̔̍h͉͈͔ͥͭ̈́̇̃k̠̄͑̅͌s̫̫̖̝̤̥ḑ̠̪͕͙̭͍ͫr̩͈͓̱̻ͮ̍̓̃ͣj̜̋ͣ̇͐g̢̝̗̺̰̖̺̹̔̅ͮ͑ͩ̔h͔̭͙ͭ͊ͪk̨̄̽͛̎ͧ͋̚j͍̫̦̪͗k̵̺̲̣̹͇͓̥͊̎͐̅̂̍̚d̰̟̺̲̭̙l͖͕̘͉̰̳̖ͣf̧̊̍̽̍ͫ̀ȟ̺͉̉́k͉͑ͨǵ̈́̅ͬ̀̚a̟̺̞ͮs̫̦͙̳̥̦ͯ̂ͯ̓͂ͧ͛ǩ̵̥̊́͊ͨl̙̩̍̍̾d̥̗͇̱̻͔̞̉k̝̠͎͛͒̕f̢̣̫̩͕̗͙͂g͓̮̯̥̮̳̩͗̌̎k͆̋̂ḑ̖̼̥̩̹̥̩ͦͭͤͭͣa̶͐s̢̫̩̥͇͍͉̽ͤͥ̌̑̌ͯk̛̳͔̘̓ͫͅd̻͓̲͇̤͆́k͏̰̘͓s̭̭̫̓ͫ̇̒̒̈́͂ͅǎ̬̰̤͍̼̻̖̔͆̔̐͋́̚d͖̤̜̗̪͊̈́̎͛ͮͫ͒͜j̶̈̓ͫ͛ͮk̮͕ͩ̓͠ͅs̨͒d͗̅ͅŝ̹̺̟̙̗ͬͪ͋ͪ̌ḓ̴̭̳̙̺͇̉̍̏̉̇ͫ");
        System.out.println("d͕̘͉̰̳̖f̧̊̍̽̍ͫ̀ȟ̺͉̉́k͉͑ͨǵ̈́̅ͬ̀̚a̟̺̞ͮs̫̦͙̳̥̦ͯ̂ͯ̓͂ͧ͛ǩ̵̥̊́͊ͨl̙̩̍̍̾d̥̗͇̱̻͔̞̉k̝̠͎͛͒̕f̢̣̫̩͕̗͙͂g͓̮̯̥̮̳̩͗̌̎k͆̋̂ḑ̖̼̥̩̹̥̩ͦͭͤͭͣa̶͐s̢̫̩̥͇͍͉̽ͤͥ̌̑̌ͯk̛̳͔̘̓ͫͅd̻͓̲͇̤͆́k͏̰̘͓s̭̭̫̓ͫ̇̒̒̈́͂ͅǎ̬̰̤͍̼̻̖̔͆̔̐͋́̚d͖̤̜̗̪͊̈́̎͛ͮͫ͒͜j̶̈̓ͫ͛ͮk̮͕ͩ̓͠ͅs̨͒d͗̅ͅŝ̹̺̟̙̗ͬͪ͋ͪ̌ḓ̴̭̳̙̺͇̉̍̏̉̇ͫ");
        System.out.println("I̢̢͎͍͓̬͖̰̦͔͉̪̻̗͉̦͕ͮ̔ͫ͆́͘͠ͅ ̸͗͆̿̔ͮ̈́̐͐ͪ̾͑̈͋̋̐ͬ̓͌́͢҉̳̟͓̣͕͙̺͕̻̙̞̤̗̹̗͇̼̟ͅW̴̷̸̛͛ͮ̔͊̽̊̇͐̇̃͛̒̆ͯ̊̐͊҉̳͈̪͉̯̱̖͔̤̥̘̝̣̣̣͕ͅI̷̵̳̖̺̥͓̮͚͍͇̙͎̯͍͓̗̪̋ͩ̐ͣ̅ͨ̔͊̾̚͡Ļ̴͚̜͓͍̥͈͎̥̼̺̻ͩ͑̒̆̈̅̓͑͊ͩ͌̕͘ͅL̶ͪ͂͑ͩ͛̾̽͗҉̡͎͉͙̲̪̪͔̣̣̯̳̠͍̱̘̰͖͢ͅ ̴̸̡̨̼̘͉̠̼̟͖̞̣̳̂̄̈́ͩ̋ͭ̐͗͑ͧ̊̎͊̒ͥ͊̐͒̌K̅ͭ̈́ͭ̿̈̉̊͂̊̓ͮ̀͏̰͕̥͇͍̟͖Ì̛̞̩̳̠͖̰͇̻̺̟͖ͨ̐ͤͯͭ͐̒̅ͪ̄̃ͫ̄͢͠͠Ḻ̢̨̞̫̟͂͂̅ͬͯͫ̊̌ͨͦ̌̒͒L̢̯̺͇̹̇ͤ̈̏ͣ͆̇͌͢ͅ ̸̧̨̗̥̮̝͎̻̲̻̞̮̹̯̐ͩͫ̈̈̓͌ͪ̒͊̌́͞Y̨̢͇͇̜̞̹͇̰̠̜͖͉̹͇̥̗͗̿̈̃̊̉ͣ̆̿ͥ̈́͌ͮ̆̉̇ͭ̒͘͡Oͦͩͦ̎̃ͮ̾ͪ͢͏̯̣̦͈͍͍͓̼̯͖͍̩̹̬͢͜͞U̱̯̗̱̭̦̭̝͉͔̰͌ͧ͗͗͐̆ͮ̋̓̒̀͗̅́͢ͅ");
        System.out.println("F̶̝̪̬͕͔̖͚̻͔̠̙̤̼̜͈̬̞̮͠È̡̜̣͉̲͖̥̩͙̱̘͔̳̘͉̕͠Ȩ̵̷̢̝̖̺̪̤̩̖D̸̞̹͚̼͈͇̠̭̩̻̬͇̖̞̺̜̲́͝ͅ ҉̵̯̦͍͔̥͈͚͓͎͔̹͈̣̠̰̲̼͘M̴̴̶̨̛̤̥̫̠̟̘͚̹͍̹͙̞͕E̲͔̺̫͢͞ ̨͔̥͉̗͉͇̜̩̲̺̖̙̼̫͙́̀̕Y̨͙̜̣̯̗̘͜͞Ǫ͓̦̫̬̙̖̬̺͘̕͟͢ͅU̥͈̤̳̻̙͈̠͖̟̞̼̭͈̟̬͢͜͢͝͡Ŗ̢̭̤̝̬̖̯͙͕͖̜̠͟ͅ ̧̗͔͖̪̰̯̯͔̣͎̺͔͈͖̕Ş̶̝͔̻̝̳̺̜̫̞̻̠͙̯̞̝̰͠Ờ͏̡̢͚͚̘̩̻U̲̱̭̣̮̹̖̜̬͈̻̖͟͝͝ͅĻ̝̳̮̜͎̤̘̖̼̱͠");
        System.out.println("d̰̟̺̲̭̙l͖͕̘͉̰̳̖ͣf̧̊̍̽̍ͫ̀ȟ̺͉̉́k͉͑ͨǵ̈́̅ͬ̀̚a̟̺̞ͮs̫̦͙̳̥̦ͯ̂ͯ̓͂ͧ͛ǩ̵̥̊́͊ͨl̙̩̍̍̾d̥̗͇̱̻͔̞̉k̝̠͎͛͒̕f̢̣̫̩͕̗͙͂g͓̮̯̥̮̳̩͗̌̎k͆̋̂ḑ̖̼̥̩̹̥̩ͦͭͤͭͣa̶͐s̢̫̩̥͇͍͉̽ͤͥ̌̑̌ͯk̛̳͔̘̓ͫͅd̻͓̲͇̤͆́k͏̰̘͓s̭̭̫̓ͫ̇̒̒̈́͂ͅǎ̬̰̤͍̼̻̖̔͆̔̐͋́̚d͖̤̜̗̪͊̈́̎͛ͮͫ͒͜j̶̈̓ͫ͛ͮk̮͕ͩ̓͠ͅs̨͒d͗̅ͅŝ̹̺̟̙̗ͬͪ͋ͪ̌ḓ̴̭̳̙̺͇̉̍̏̉̇ͫ");
        System.out.println("Y̭̪̦͇̩͓̼̣̥̲͔͚͕̭͘ͅǪ̸̵̺̭̩̠͉̗̥̞̖͍͙̻͉̗̬̬̺́͠Ư̺̘̲͍̙͚̫͝R̷̨̰̬͍̫̦͘ ̢̛̙͚̫̩̠̦́̀S̠̙͍̪̻̞̜͖̯̙̥̲̮̮̟̖̠͇͟͜͞O̷̳̬͚̪̝̥̦͓͇͉̤̖̼̭͓͎̲̭͍͟͜U̦̪̠͉͔̯̲̳̤͉̥̳̙̥͚͢͡͠L̵͉̝̪͍̭̥̜̰̜̘͍͙̜͎͘ͅͅͅ ̛͉̰̠͇͕͔̀͝ͅI̶̸̭̠̟̭̲̳̯̺͇͔͍̰͕̫͔̞͢Ş̷̰͙̤̞̲̞̲̖͍̖͈͚͖͖͎͈̮̘͜ ̕͏̪͉͕̼͓͜Ḿ̴̡̞̬̦̝̟̬̙̠͎͖͟͞ͅI̶̸̠͚̬̤̼͉̦͝N̯͎͈̞̤̘͎͟͢Ȩ̢̝̣̤̬͍̗̫̭̳͕͙̝͍̟̞͕͚͕́͡");
        System.out.println("̧̀ȟ̺͉̉́k͉͑ͨǵ̈́̅ͬ̀̚a̟̺̞ͮs̫̦͙̳̥̦ͯ̂ͯ̓͂ͧ͛ǩ̵̥̊́͊ͨl̙̩̍̍̾d̥̗͇̱̻͔̞̉k̝̠͎͛͒̕f̢̣̫̩͕̗͙͂g͓̮̯̥̮̳̩͗̌̎k͆̋̂ḑ̖̼̥̩̹̥̩ͦͭͤͭͣa̶͐s̢̫̩̥͇͍͉̽ͤͥ̌̑̌ͯk̛̳͔̘̓ͫͅd̻͓̲͇̤͆́k͏̰̘͓s̭̭̫̓ͫ̇̒̒̈́͂ͅǎ̬̰̤͍̼̻̖̔͆̔̐͋́̚d͖̤̜̗̪͊̈́̎͛ͮͫ͒͜j̶̈̓ͫ͛ͮk̮͕ͩ̓͠ͅs̨͒d͗̅ͅŝ̹̺̟̙̗ͬͪ͋ͪ̌ḓ̴̭̳̙̺͇̉̍̏̉̇ͫ");
        System.out.println("This message should not be visible under normal circumstances. Please report this error to the developer.");
        System.out.println(ANSI_RED+"CRITICAL ERROR: int room has returned an illegal value.\nGame will now quit."+ANSI_RESET);
        System.exit(0);
        //FPowerOff();
        Death();
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Other essential code">
    public static void WildBattle(){
        poke = ThreadLocalRandom.current().nextInt(1, 14 + 1);
        if (room == poke){
            int pokeb = ThreadLocalRandom.current().nextInt(1, 14 + 1);
            switch(pokeb){
            case 1:;
                System.out.println("A wild Pidgey appeared!");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            default:
                System.out.println(ANSI_RED+"CRITICAL ERROR: The Wild Pokémon RNG has returned an illegal value. Please report this error to the developer.\nGame will now quit."+ANSI_RESET);
                System.exit(0);
                break;
                }
        }
    }
    public static void Inv(){
        System.out.println("You have:");
        if (PokéBall == 1){
            System.out.println("PokéBall");
        } else if (PokéBall >= 1){
            crash();
        }
        if (sword){
            System.out.println("Sword");
        }
        if (iPhone){
            System.out.println("iPhone 7");
        }
        if (Galaxy){
            System.out.println("Samsung Galaxy S7 Edge");
        }
        if (Lucario == false){
            System.out.println("Lucario inside a Pokèball");
        }
        if (GalladeCaught){
            System.out.println("Gallade inside a Pokèball");
        }
        if (ArceusCaught){
            System.out.println(ANSI_RED+"An Error has occurred."+ANSI_RESET);
        System.out.println("This message should not be visible under normal circumstances. Please report this error to the developer.\nGame is exiting to prevent further errors.");
                    System.exit(0);
        }
    }
    public static void crash(){
        System.out.println(ANSI_RED+"An Error has occurred."+ANSI_RESET);
        System.out.println("This message should not be visible under normal circumstances. Please report this error to the developer.\nGame is exiting to prevent further errors.");
                    System.exit(0);
    }
    public static void Chopper() throws InterruptedException{
        chopper = true;
        System.out.println("You board the chopper.");
        Thread.sleep(3000);
        System.out.println("You see something behind you but it quickly vanishes out of your sight.");
        Thread.sleep(3000);
        System.out.println("You escaped from the area successfully!\nYou win!");
        System.exit(0);
    }
    public static void FChopper() throws InterruptedException{
        chopper = true;
        System.out.println("You board the chopper.");
        Thread.sleep(3000);
        System.out.println("The helicopter crashed into the almight Arceus!");
        Thread.sleep(3000);
        System.out.println("The almighty Arceus looks extremely angry at you!");
        Thread.sleep(3000);
        System.out.println("The almighty Arceus used Hyper Beam on you!");
        Thread.sleep(3000);
        System.out.println("You died!");
        Death();
    }
    public static void IPowerOff(){
        //instant power off
        System.out.println("This will be for instant shutdown");
        System.exit(0);
    }
    public static void FPowerOff(){
        //fast power off
        try {
            Runtime.getRuntime().exec("shutdown -s -t 30");
        } catch (IOException ex) {
            Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void PowerOff(){
        try {
            Runtime.getRuntime().exec("shutdown -s -t 60");
        } catch (IOException ex) {
            Logger.getLogger(TextAdv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void Quit(){
        Scanner reader = new Scanner(System.in);
        System.out.println("A system shutdown is required to quit.\nWould you like to shutdown now?");
        String command = reader.nextLine();
        if (command.equals("yes")){
            //FPowerOff();
            System.out.println("Shutting down...");
            System.exit(0);
        }
    }
    public static void Death(){
        if (DebugMode){
            System.out.println(ANSI_RED+"Cheaters never win."+ANSI_RESET);
        }
        if (CheatMode){
            System.out.println(ANSI_RED+"Cheaters never win."+ANSI_RESET);
            System.out.println(ANSI_RED+"CRITICAL ERROR: Cheat mode is enabled.t̸̳̖̜͇̖͙ͭͣ͑͆̂ͭ̐̃͗͗͠f̡̢̻̯͖̝̰̙͕͒̏̏̽ͤ̍̈̂̿͂͐͆̽̀ͅb͓͎̩͍͕͙̪̣̰͔͑̅̾ͬ̑͋͢͢͢͝ͅḑ̶̬͕̼̮̮͚̮̟̺̠ͩͣ̓̊̊ͯ̍̏͑ͭ͐̋̑͟ͅs̰͉̝͙̙̗͚̩̤̙̭̥͇̈̎͗ͨͪͦ̌͜ͅj̰̼̜̣̞͐ͮͬͥ̉̍͊͢͞f̶̔̐̋̋́̾̍̽ͪͪͪ̐͌̃̃̚͏͏͏̹͎̙̖̼͈̘̲̠͖̘g̨̛̯̰̪͈̫̙͈͔̝̾̀̔̋ͨ͂̾͐ͤͭ̿̾̑ͮ̓̔̚͞͡͡g̸̤̼̻̹͔͇͔͔̖͉̗͔ͯ̈̆͗ͤ͊͋̅̽́f̧̭̠̻͚̺̙̼̙̱͓̤͉̱ͧ̄̈ͧ͑͛͆̅ͪͣ̿̚s̐̆͌ͧͥ҉̷̴̜͎̰͈͖̩͖̥̖͖̭̕͢ͅͅh̷̑̀͑̍͟҉̴̨̠̟̩͚̮̣̱̜̝̹͍̙̺̪̣;̀̑ͪ͆ͧ͊̍ͧ͆̆̿̒̐̃ͣ̆̽̃̚҉̢̳̺̪͇̯̼̰ģ̸̪̯͈͎̩̦̮̪̟̜͖͈̫̼̻͖̝̖̇̍͋̀́̕͡f̧̖̤̣͎̮̯̣͚̜̬̖̯̱̰͊͌ͥ͑̊ͮ̎̅́̚s̵̶̴̛̺̺̣̖̼͚̝̪̉͌ͫͯ̓ͭ̇̈́̂̄̎͝d͙̹͖͈͚̤͔͉̩̗̰̘͔̖̙̯̾̎͊͋̈̈͒̀ͪ̄ͬ̑ͧ͆̑͜͜b̷̡̙̗̰̮̘͆͋͐ͯ̏̄ͥͤͫͯ̂̇ͫ͋̚͡n̗̻͖͇̟̬̱͉̘̱̘ͦ̿̓́ͤ͋ͭͭ̌̅̅ͬ̿͂̒̚͜ͅͅy̸̨̧̤̺̭̬̪ͥͭ̎̇͂̾͢c̻̦͎͙̗̬̦̗͖̙̱̮̞̗̦͆̔͋̚͞ͅx̵̬̖̠͖̮̗̱͕̥͎̝̬̺͓̟͍͌ͥ̈͗̕̕͠n̫͎͎̥̮̩̦̖̫̳̤͙̟̝̟ͫ͆ͤ̑ͯ̒̌̅͆̆̓̓̐͠ļ̛̜̲͎͓͚̝̳̙̲̻̦͖͇̳͈͖̻̓̾̋̾k̷̡̝͚͔̘͐̌͒̄ͬ͋́͒͗̓ͭ̏ͬ̋ͣ͘͜ṋ̢̤̮͕̤͎͍̠̣͓̳͕̙̳̲͖̩̒ͮͧ̋̾̀̍̈͑ͣͨ͑̃̽͌͑͝ͅh̷̲̱̹̲̭͔̠̟̀͂̿́͂̇̽̍̊ͯ͘͝ș̶̢̠̺͙͙̱͚̹ͭ͆ͭ̀̀ͤ͆͘͝ͅz̶̡̝̗͈̦͇̯͕̫̲̘̳͈̥̣͚̈́̉ͮ̎êͣ̇̍̄̊̊͐̈́ͣ̊̔͒̽̔̊ͤ͐͏̧͖̭̗͓̞̹͉̼̬̦͟͞ͅŗ̢̜̦̭̼̬̎̎̊͋m̵̢̽͛ͩ̽̔͒̇͘͏̫̮͓̩͈̩̬͕͙̹̤̱͇͓͈̰ͅg̸̠̫͈͔͚̦̖̲̦̙͈͖ͭ̏́ͥ͊ͨͬ̐͌̀͗̈́b̶̡͈͇̪̞͉̪̟̬͉̥̯̦̋̍͊ͯͮͦ̎̽̐ͣ͜͞ͅḓ̷̸̨̱̰̣͚̳̳̲̼͙̥̯ͯ͋͂̐̇͑͑͂͊̏͂̀̆̚͞ț̛̫͔̙͓̞̖̮̱̻̒̐̏̿̽̓ͮͤ͂̌ͥͥͣͫ̐͑̀̈́ͩ͞y̨͇͉̘̙͙͚̩̠̰̠̘̠̹̗̯̘̜̙ͧ̅ͬ̄͐̒̅͢ǹ̴̡̦̻̹̥̬͊ͯͬ̈́ͣ̎ͅj̶̡̡͍͇͎̺̹̱͔͔͛̅ͨ͐̿ͅ ̶̨̼͖̜͙̫̭̺͈̻͖̗̠̜̈́̆ͥ̐ͫͫ͂̎̏ͭ͗͞ͅt̷̮̳͔̥̠̤̹͕̪̼͎͇̥̞͎͚͎̠ͩ̓͗̏̏͞h̴̨̛̗͉̬̺̥̤̩̬̰̘̣ͦ͊ͪͪ̽̇͗ͭ̓́ͅb̑̋̊ͬ͏̨̪̳͎͍̘̼̥̦̱̯̹̀̕͝ͅ ̜̙͍͍̘͔ͨͥͥ̇̈͌̊̅͗͆̎̓͑́́̕͢xͣ̓ͥ̄͋ͪ҉̶͖̗͇͕͇̺̙̻̦͈͖͡f̸̿̒ͣ̓ͭ͊́̚͏̶̢̛̖̰̯̘̯̣͍̹̮̗̠̰̘͖͇ͅb̵̏̌̏̉̽͆͒ͮ͑ͭͭ҉̡̢̲̮̙̱͇̖̱͖̜͕̺̻̫͚͓ͅͅk̢̡͖͎͈̠̮̬̬̯͎̻̭̮̣͓̪͓͖͊͋͂̔̿ͯ͆ͣ̌ͪͩg̸̡̞̱̲̪̖͍͓͇̣̠̤̎̓ͪ̅ͧ͞͠m̷̴̟͖̞̫̝̹͂̏̾̿ͦ̐b̵̰͖̳̫̖͔͉̬͍͎̗̱̥̘͙͚͖̠̆̂̋̇̓̅ͨ̈́͋͘͢ͅ;̶̺̯̱̞̻̤͕̠͙̻̟̻̬͇̝̋ͨ̆ͥ̇̓̾͡ͅl̵̢̛̙͓̭̲͇̪̹͕̅ͪ͑ͬ̏̒̀j̡̧̝̣̞͚̲̥̗ͣͭ̎ͪ͐̆̈́̂̃͆ͯ͟͝ṉ͉̤̬̰͇̭͕̩͚͎̩̜̪͕͌͂ͩͯ̓̿ͫ͡͝͞ğ̷̨̭͕̩̜̮̝̱̗͎̫ͧ̐ͣ̍̆̈́ͤ͘m̸̢̪̼̭̰̭̹̺͈̜͕̹̦̗̮̥͊̈́ͤͣͭͭ̓̋͒̋̇̄͞r͂ͣ͗̔ͭͧ̓ͦ̉̋͆ͯͤ͋̏ͦ̚͡҉̰͉͓̼̣̪̞̲͙͔̠̬;̛͇͉͈͇̻͍͕̤̙͒͂̈ͪͣ̀̑ͩͫ͐̎̽̔͂͘͟͠ḷ̛̰̫̼͙̮̘̗͖͔̘̻̝̫̭̠͕͎̃̇͂̈́̒ͩ̐͆ͭ́̏ͬ̎̏ͯͣ̃̇̍͘͡͞m̴̡ͬ͐͂͊̓̌͋ͤͩ͆͆ͦ̅͢͟͏͚͔̘̦̥̗̘̤̯̬̥͉̣̯,͋̈̊͐̇̽ͮ͊ͧ͑҉̶̶̧͓͈̫̻͈̠̭͚͓̘̠̀ͅͅḩ̴͙̖͉̳͗͆̾ͦ̅ͣͬ̑̇̈́̉̋͛̍́d̴̤̯͕̼͚͍̘̘̼͍͖̞̝͙̯̥̘̳̻͛ͦ̀͑̂̈ͤ̄̀͘f̢̨̻̥͉̺̦̺̰͙̝̯̟̖͑̅͗̆̈̓͌̀̉ͣ͡͞ͅ,̷̝̺̣͓̪̤̱͔̹͚̓ͫͨͧ̇͌ͥͧ͂̈́͢n͍̰̠͓̜͓̬̖̖̻͔̘ͭ̃̅͆̾͌̈́̽ͪ̉̓̊̒̐́͘͟͝;̍ͧ̈́̿͝͏̢͍̼͉̠̯͓̮͕͇͙͓͔̥̭̦̰̖ͅl̵̛͎̫̝͔̭̘͙̩͙͙̮͔͒ͬ́̐͂͛́̏̔͂̓͘ ̴̷͊ͫ̀ͪ̊ͧ́҉̘̝̤͕͎̲̲̠̜ͅḇ̞͙̠̮̙̉́̆ͧ͒ͥͣͣ͌̐̓͑̒̌͊̍̕'̨̓ͣͣ̓ͭͣ͗̅҉̢͏̖̻͉̟̺̫̻̫v̷̵̮̤͎̞̱̳̥̣̬͇̜̏̾̒͑͊̒̑ͯ͂ģ̵͎̘͙̝̘̠̗͚̫͈͉̜̫̪͙͕ͬ̄̇ͮͭͭͭͩ̓͑̒͘hͬ͗̋͋͑ͧͨͨ̽ͭ̊̿́̍̚͏̸̭̫̙̬̥̗̪̤̦ "+ANSI_RESET);
            System.out.println(ANSI_RED+"Game will now quit."+ANSI_RESET);
            System.out.println("f̷̝̭̙̹͕̪ͣ͌ͦ̚͘ͅḍ̶̘̮̰̯̥̘̱̙̰͓͈̲̲̥̣̠͌̌̍͌ͨͤ͛̈̋̊͌ͧ̊ͬͣ̈́̀̚̚͡ͅs̢̼̠̗̫̬̜͚͓͙̙͔̗̬̦ͬ̋̽͑̑͛ͧ͊ͬ͛̌͟ẅ̛̬̺̥̻̟̗̙̹͙͚̠͚͎͉̼́̐ͤ͒ͭ̃͗ͬ͗̐͒ͪ͊̔ͅe̊ͤͬ̀ͥ̕͡҉̱͈͇̰̭̲̠̼̭̱͝ͅf̴̄ͤ͐̃͑̎̌͂̈͗͗́̕҉͈̱̪͔͎͉̻̜͉͠s̢̜̥̗͙̺̣̫̹̗̳̤̼͕̙̫̣̩̫͗̊̾͗̊͛̌͂͗̀ḋ̴̜̮͉̙̻̜̼͓͇̣͉̼ͬͭ͊̌̓̽͐̐͜f͛̆̅ͬ͑̇ͨ́̐̄ͪ̍ͨͯͥ͆͏̯̬̪͔͎̤̬̰̘̮͖͍̮̙̬͟͡s͈̖͇͕̩̘̺̠̫̰̮͇̻̫̎͑̅ͪ̇̾̋̒̄ͩ̀̆ͫͤ͆̆̚͘͝ŗ̢̟̫̥̺̩͓͉̪̜̫̍ͬ̓͐͌ͨͨ̓́ȩ̵̛̩̻͙̫̝͎̖̮̠̲̑ͫͣ͐ͥͣ̑ͫͤͧ̀g̴͇̦̱̣̜͉̫͚̱ͫ̍ͩ́̚ͅ ̸̴̸̢̰̗͕̘͚̤͍̜̞̺̽͛̈́ͨ̽ͩͩͯ͋ͯ̂̆́ȩ̶̴̧̡̘̘̖͔̯̘̖͕̤̼͎̯̐̏ͮ̾ͦ̇w̶͎̜̳̗̻̹̩̰̖̘̫͊ͥ̍̂͊̾͒͒͂ͧͨͭ̔ͭ̌̕͟ͅͅs̸̸̘͓͓̪̝͖͕̻̝̜̦̤̺̩͈̟͇ͦ̊͌ͪ̿ͩ̀̌ͯ́̋ͤ̾͂́̉̔͛́̕r̵̡̧̻̱͙̫̙̤͈̖̣͇̿̽̾͊́͟f̸̷̙̥̣̪̻͔̘͙̠̰̞͚̩̭̲̊̂̆̒ͪ͐̇͛̅̿ͯ́ ̷̷̤͎̬̲̬͈͎̮̱̞ͯ͐ͭ̄̈̋̇͋ͨ̊̓̄̑͊́̚s͂ͬ́͗̀҉͏̼͓̠̟͕f̍̎͂̈́̈ͪ͆͗̅҉͓̙̬̹̥̟͎͉̟̲̤̻̖̟̭͔̗ṣ̴̷̷̨͙̣͈͉͓͙̲̠͚͖͍̹̪̭̻̼̃̇͆̌͂ͯ͌̌̒͑͊̊͗̿͒́̚d̴̳̖̬̞̲́ͨͭͭ͛ͬ̊̃ͩ͒̕͞͡f͙̯̭̟̹̫̳̺̟̟͕͔̜̟̘͍̞͍͋̆ͦ̄̄̓̆̏͆̇̐̚̕͘w̢̜̯̩̲͓̯̭̝̬͆̈́ͭͧ̋̾ͭ̌̀̚̕͞s̷͕̗͖̱̗͓̰̈ͧ̅̔͛ͤ̅͑̀͢ͅe̷̵̢͙̩͚̯̯̰͓͖̠̖̐ͭ̐͗̅͒͐̓̋̉̀ͨ͋̆̐ͨ̍̕͟fͬ̊̋̆͊̇̂ͮ͊ͣͪ͆ͧͯ̃̔̚͡҉̷̝̰̰̲s̶̵͈̣̥̹͍͉̦̠̺̗͚͕̱̠ͯ̄̈́ͭ̃͋͆ͯ͠͞͝ͅd̵͇̖̬͓̦̼̜͚͕̹͇̹̟̘̱̖̅ͬ̈́ͥͭ̉̋̃ͨͩ̃ͤ̐͘f̡̈̓ͯ͋̑ͨͬ̉̈́҉͙͓̺̻͕͇̭̲̖̠͈̜͔̬͕̳̝̪̀̕͡w̷̼͖̙͇̼̭̙̞̫̳̩̦̤̱͒ͬ͒̾̔̌͊͋ͣ̚͟ę̗̬͖̩̗̬̔̑ͧ̿ͫ̐ͪͨ̒́́̕͝f̡̢̬̳͔͕͈̙͚̜ͣ̀̆́ͥ̌̇̿̐r̶ͪ̃̏ͭ͌̒̐̚͘͡҉͕̬̦̜d̷̦̟̭̖̝̭̖̜͙͕͉̋̑ͪ͌̇͆ͫ̽͂̒ͧ͐̌ͥ̅͛ͦͣ̀͜ͅͅs̶̸̥͈̝͚̮͙̺̮̘̟̳͇̻̺ͪ͒ͫ̆ͥ͐̈͑̽̈̌̎̓ͯ̌̓͋̚͠͡f̴̛̛͈̥̬̱̗͖̟̮͉̫̯̫̯̲͒̋̊͂̏ͥ̃ͣ̔̋ͯ̚͘ ̶̶͉̻̝̘̲̪̼̰̻͓͙͖͙̹̻̺̘͍͒̍ͯͪͪͨͩͯ͆̂ͭ̐ͩ͆̿̿́ͅdͤ̐͑̑ͫͨ̍̍̎͒̕͠͏̩̱͎͓ͅf́͑̆ͮͪ̾̍ͬ̉̑̿ͩ̈́̃ͭ̚̚̚҉͓̳̣̼̟̟̖̪͕̭̤̝͇̯̜̣̀͜͝s̴̨̩̝̖͎̆͐̏̿̐͗̓s̶̢̨̙̹̟͈͙͔͕̯̳̗ͨͨ̓̿͘ͅe͙̠̝͙͖̥͉͇̱͈̠̹̤̗̳̦͈͙ͯͭ̏̐̃ͪͤ͂ͧ̈̿̇̓̆̏̂̾̀͜f͖̯͖̫͈̙͉̳̱̞̰͓̞́̃͋̽̽̅̍́͂̂̊̍ͣ͌ͣͩ͜͜͡ͅs̅͒̃͛͗҉̻̜̩̘̫̤̘̻̼s̜̠̲̱ͦ̓ͬ̑ͥͯ̅̐̃͂̈ͮͭ͛̄̒̐͜ẻ̷̴̷̢͕͈̟͔͍͗̉̈̆̄̇͐͒̈́ͬ̂ͬ̀̈̓͒̚f̶̻̺̟̟̘̠̠̥̝ͩͥͣͫ̀̕͡͠ͅͅd̷̢̪̻͓͇̖̮͉̹̖͍̣̦̳̱͍̭͇͆̓͑ͭͯͭ̈́̍̚ş̴͎̬̩̠̳̱̐̐̄̍̓ͭ͐ͦ̄̓͑͒͜f̸͛ͣͯ̎͗̉̿͏̯̲͎̮̤̫̘͕̜̟̲̼̣͉ ̛̖͍͖̺̱͙̮̞̼́̔ͮ̿͟ͅą̢̖̮̟̩͉͓͂ͯͮ͂̍͆̅̿ͨͤ͑ͤ̀̅̒͊̇̚̕͝j̵̮͚͕̫̱͓̰̝̖̠̺͙͖͍̱̪̱̋ͩͥ̀ͬ̄̂̀̒̌̊̿̄̒͆̚̚͝s̡̖̫̜̞̦̏ͧ̿ͭ̒ͩ̀̏ͪͪ̐̈ͣ͠h̑̈́ͬ̏̓̽̉̎̾͘͠͏̸͚͙͇̼͇͖̺͇̙̗͔̝̪dͣͨ͂͋̄ͩ͆ͮͨ̃ͣ͌͏͏̡͟͏̞̗̜̠͈͇͖̜̗̥̣̜͚f̴̡͒̆ͫ́̇̌͏̨͙̜̩̱̩̟̥̲̝̟̮̱̱̬͓j̵̠̪͖̝͎̼̳̭͇̩̙̹͎̽ͪ̏ͯ̔̀ͮ͂ͧ̔͊̑͆̌͜͠h̨̎̿̉̌͏̴̴̰͙͕̲͙͓̲̱̝̖̀d͆̌ͨͤ͆̍͐ͣͩ͂͐̋͞҉̴͘҉͇̮̠̳͙̣̝̺̙̩̙͖f̷̧̪̮̭̣̯̫̜͆͒̑͊̿ͤ͌̾̎͑͋͠g̵̙̱͍͚͇̮͎̩̰̖͚͔̯̮̝̘̣̽ͮ̓̉͆͠j̹̠̤͖̳̦̳̻̺̬̩̼̮͉͍̗͉̣̆́̋ͫ͑ͩ̀̇̈̎́̀̚͜ͅẖ̵̴̴̢͔͕̞̹̟͙̭̱̜̝̣͔̟͍̱̱ͯ̀͊̂͊ͣ͂̇̀̇̌͑͜e̛̤̩̰̹̯͚̲̼̜̝̘̟̺̺͍͚ͮ̃̽͑ͥͩ͋̌̊ͦ̎̚͟ͅd̨͕̜̹̲̺͎̫͐͋̃̓̈̓͌̽̿̒̀͘g̎̿̽̊̅̈̾̿ͥͩ̂̽̾ͨ̿͌̾̀͏̤̰̬̱̞̼̮̼ḩ̴̟͕͇̠̣͙̙͉̫̹̳̰̝̟͉̄̆ͤͦ̑̒ͬͩ̏̽̉̽̏ͦͦ́͠ ̓̔̒̐̔̒̓͆̅̈́͏̢̣̱͎͕͔̼͎̰̘̖̘͈ͅj̛̣͓̤͖̊ͣͣ̒͐̄͗̏ͤͫ͒̓̾̑̽͐̾͆́j̲͕̘͓͓̑ͬ̓̈́̽̀́͝f̨ͧ͊̂̓͏̞̝͈̦̗̩̺͙̥͇͘g̴̘̪̺͉̻̳̒ͤ̉̅̎͊̌̚j̶̝̙͙͍̦̹̳̥̓̑͂̔̇̒ͬ̈ͮ̇ͯͣ́̚͘͡k͌ͬ͋͋͜͏̣̹͈̗͍̘̼̰d͒ͣ̈̃ͯ͋̕͠҉̩̲͎̗̞̘̻͉͚̼ṣ̦̱͖̮̤͔͚̣̙̤̩͎ͯͫ̈́̓̆ͩ̌͑ͯ̏͛ͥ̈́́́h̸̢̛͙̪̻̭̩̮͉͈̟̐͂͋͛̏͒ͪ͆̂̃͌̾ͩ̽̌ͦ̋̀͘f̴̢̤̼̟̺͙̌ͦ̅ͭ̊̍͌̽͋͒ͩ̇͜ ̭͔̻͇̺̓̍͒̌̏̈ͣ̔͂ͤ̀̽̊͢͝k̷̡̡̡̛͈̹̟̳̟͓̩͎̼͓̲͍͓̭̥͗̍̔͆ͯ̀͋̌ͯͪ̓j̢̡̗͓͔̞̄͋̚̚͟h̻͚̝̗͚̦͓̤̠͚̪͓͖̳ͨ̓ͫ̍͐͛̈́̊͜͠d̻͚̗͓̙̫̗̯̼͛̀͊ͫ̆̍̔͐̄̀̇̌̃̎͟͟͟͞͡f̡̱̖̰̥͈̜͍̟̗̭͈̠̞̮̙̫͎̅́ͫ̏̽́̍̈͋̌͂́̐͆ͮ́͟͡h̡̩̩̥͎̑ͬ͋̊̓͡ḑ̴̭̩̟̮̮̗̮̥̭̠̣͉̦̇̀̊̔̑̓̎͘͠h͕̲̞̮̱͕̓͊̿͐ͬ̃͛ͪ̄͛͊̂̑͌̀͘͟f̷̺̺̝͓͓̯͕̝̟̼̗͚̺̫͒̃ͧͪͩ̈́ͬ͢h̴̴̛̫̖̰͍̟̣͉̖̤̗̜̫̩̺̘͕ͪͪ̾͋͗ͧ̌ͪ̂͑̄ͧͤ̒͋̄̃ͪ̚j̡̍̏̀ͮ̽҉̨̥̺̥̣̪̟̠̥̜̲̳̻͕̥̤d̿ͭ̊̽̄̚҉̢̠͕̝̞͚̤̳̮̣͍̫̲͉̝̣̫̖̯̀s̴̨̞͖͇̹͇̤̯̯̼̟͙̼͒͊̏̔ͨ̍̇͟h̴̛̳̰̻̘͓̼͙͚̻̦̣̱̥̫̭̑̿͐̀͂̑̓͗̉ͪ̓̈͆ͫ̑͘͡g̶̡͈͈̯̥̘͙̤̙ͮ̔͐̇̒͌̿̈́̌́́dͩͩͥ̔͛̒ͥ̀̿ͣ̋͊̊̂̿̇ͬ́͟҉͡͏͇̝̭̪͖̪̥̥̯̠̫̤͓̘̮̜̫ͅs̵͈̥͖̼̬̬͈̥̱̻̟̹̍͂̊ͪͣ̐̓͊ͪ̿ͥͪͅͅh̵̨̙̠̭̭̙͓̟̩̯̰͔̝̻ͤ͐͗̌̊̂ͫ̔ͧ̀́͝j̸̶̥̳̗͎̩̞͖͑͆̊̑̇ͪ̓́̃́̀̔̔͒̃̋͛͆͟͢͟ ͦͪ̑̐ͭ҉̗̙̮̝̯̱̲̟̱̝͎͞͞g̶̶̋̀͛̒ͬ͑̇̋ͫ̅ͧ̔ͪ̑̎͏̡̥̪̪͕͕d͖̻̩͉̜̬̖̣̄́́ͩ͂͌́́̚͘͢͝s̶̨̛͉̣͖̙̥͉͙͙̖͓̦̯̹͕̳̲̤̯͗ͦͯ̇̃ͬ̀ͬͥ̂̓̚ͅh̟̱͚͍̲̬̪͉͇̰̝͇̳̤̋͐̾ͬ͐̎͒̂ͣ̓ͭ͘̕h̨̿ͯͪ̈́̀͏̴̘̪̪͓̰̦̥͖͎̯̩̤j̴̬̩̝̣͚͇̻̞̤͎̙̙̲͇̱̹̊͐̇̄͊ͩͧͧͩ̒̌͆̚̕͡ģ̥͕̙͕͚̘̳̙̼̘̳̫͈͈͛͐ͨͦ̏ͧͬͭͫ̔̂̏͒̂̄͋ͨ̿̊͟ͅj̵͌̉̊́ͩ̆ͦͫ̔́̈̃͛͊̇̀͏̩̝͖͉̖͎̗k͌̆̽ͬ̋̇҉͍̙̫̥̥̯̼͈̺̮̹̹̻̰̙́͟ͅf͆̀ͬͭͥ̾̓͏̟̪͉̹͓̺̤͙͕̹͙̩͔͈̝̪̳̳̥k̡̛̮͈͖͓̱̹̗͙͉͚̋ͭͦ̾ͮ͑ͥͦͯ̅͗j̀̇ͤ̚҉̜̮̳̞̖̬̝̣̼̘̰ͅḓ̵̛̬̙̼̥̞ͬ̋̅͒̽ͪ́́f̧̼̞̭̟̫̠̮͓̟̱͍͓͔̝͙͌ͪ̉͛̈́̀̚͟͝ͅͅh́͋ͪ͋̀͆ͬͧͪ͛̐͞͏̸̷̙̞͉͇̳̰̭̗̳g̸̡͑̇̄̊͏̸̧͚̜̬̪̹̝̜̺̼͎̘̘̳͉j̵̴̧̠͇̯̳̤̥͇͇̯̣͕͓̩͚͇͕ͯ̆̂̉ͨͭ͟ș̛͉͚͎̲̟̪͙̣́͋̇ͤ̏̓ͫͤ͑ͩͯ̓̅ͭ͛͢a̸̴̎̈́̎ͦ͐̒͒͏̵̴̭͉̻̦̳̯͖͎h̆̆̍͗ͮ͌̄̇̌͌̽ͨ͐͛̇̽͛҉̘͎̜̮̖͔̯͓͉̟̻̪͉̖͇d̷͙̲͙̖̣̬͔͇̣̯͔̼̖͎͎̉͛͑ͮ̽̅̾ͪ͗ͦ͒̃̓ͯͦͪͭ̊̀͘ḧ́̊̓̓͋̈́ͧͧ̏̿̏̂̐ͯ̐̀̋͏̵̕͏̡̰̦̖̼̺͎̪̦f̶̸̨̪̝̰̯͇̝̬̞̠̪̬̝̯̦͚͛͗ͭ́̓̆̀ͩͣͯͣ̔ͪ̈́ͦͭ͞d̨̡̛͉̼͈̋̎̄ͮͦ̓̓̇̈́̏ͬ̉̾̇̆̕̕h̊̈́͂̔̍ͯ̽͏̢̦̮̹̲̟̬̦̻͞gͨ̃̄̈҉̸̠̲̼̼͇̻͕͚͓͙̮͉̜͔͓̺͈͍s̶̨͕̯͙̜͈̰̦̤̪͍̠͉̤̝͔̫͊̒̅̀d̝͔͖̭̟͉̪̝̭̰̹̪̺̃̍̍͞͞͞a̢̯̠̪͖̰̫̿ͪ̈́̐̓̑̾̅̄ͫ̐͡h̷̗̙̭̰̲̮͈̻̖̘̫̩̐̉ͦ̃̒̾ͣ̐ͨ̆ͫ̍ͭ͂͢h̡̞̱̳̝̞̜̺̞͇̬̦͇̱̦̲ͮͭ̔̉ͬ̿͊̄ͭ͋́́ͬ̓̚̕͜͢͡ͅd̵̨̧̠͚̯̹̭̘͇̣̠̻̘̠ͦ̏͐̆ͥ̐͛ͮͩ̍͘͝f̷͕͕̩̗̼͓͚͎̪̤͕̦̟̣̱̤̫͛͌͌̓̓͐ͪ͡h̸̸̖͍̦̯̹̤́͂͊́͞g̶͕̹͔̝̞̻̰̰̣̳ͮ̓̋̌ͪͤͨ̋̚͠j̅̓̑ͨ̂̃͐̈́ͫ̌ͬͩ͊̆ͨ͂̌͂̍҉̸̷̨̡̠̱̖̱̦̬͓̮ͅf̶͓̫̱̲̝̺̟̟͚̗̄̊ͥ͒ͬ̒̓̌̐̒̅̌ͦ͛̚d̨̛̝͓̼͕̭̘̘̤͎̘̓͗̌͡h̸͛̃̓͌͐͗̿̒̃̓̍́͋̀͏̷͔̯̬̬͙̹̤͇͎͖̠̘̻͘ṫ̌̓ͦ͆̿͊ͣͪ̐̈̊͑̏ͪ̆͘͏̸҉̗͚̣̘̦̩͈f̢̧̫̬͖̬̪̭͎͓̟̜͖͉̋ͩͨ̀̃ͯ͗̽ͪͫ̈̿̇̕͜h̻̮̲̬̿ͯͭͥ͊̎ͧ͆̌ͬ͊̇͒ͮ̅̄͘j̵̵̧̱̪͈̼̯͕ͩ̽̀̃̇͋̅ͦ̂ͭ̑ͩͬ̅̆̈͠b̨̨̳͍̩̖̘͈̠͓̘͈̩̠͑͊̉ͨ̌̕͞͝ͅ ̶̢̤̣͇̗̮͚͈̳̜̟̼̓ͣͭ͐̍͋̾͐͋̐͗̆̾ͤ͢");
            System.out.println("f̷̝̭̙̹͕̪ͣ͌ͦ̚͘ͅḍ̶̘̮̰̯̥̘̱̙̰͓͈̲̲̥̣̠͌̌̍͌ͨͤ͛̈̋̊͌ͧ̊ͬͣ̈́̀̚̚͡ͅs̢̼̠̗̫̬̜͚͓͙̙͔̗̬̦ͬ̋̽͑̑͛ͧ͊ͬ͛̌͟ẅ̛̬̺̥̻̟̗̙̹͙͚̠͚͎͉̼́̐ͤ͒ͭ̃͗ͬ͗̐͒ͪ͊̔ͅe̊ͤͬ̀ͥ̕͡҉̱͈͇̰̭̲̠̼̭̱͝ͅf̴̄ͤ͐̃͑̎̌͂̈͗͗́̕҉͈̱̪͔͎͉̻̜͉͠s̢̜̥̗͙̺̣̫̹̗̳̤̼͕̙̫̣̩̫͗̊̾͗̊͛̌͂͗̀ḋ̴̜̮͉̙̻̜̼͓͇̣͉̼ͬͭ͊̌̓̽͐̐͜f͛̆̅ͬ͑̇ͨ́̐̄ͪ̍ͨͯͥ͆͏̯̬̪͔͎̤̬̰̘̮͖͍̮̙̬͟͡s͈̖͇͕̩̘̺̠̫̰̮͇̻̫̎͑̅ͪ̇̾̋̒̄ͩ̀̆ͫͤ͆̆̚͘͝ŗ̢̟̫̥̺̩͓͉̪̜̫̍ͬ̓͐͌ͨͨ̓́ȩ̵̛̩̻͙̫̝͎̖̮̠̲̑ͫͣ͐ͥͣ̑ͫͤͧ̀g̴͇̦̱̣̜͉̫͚̱ͫ̍ͩ́̚ͅ ̸̴̸̢̰̗͕̘͚̤͍̜̞̺̽͛̈́ͨ̽ͩͩͯ͋ͯ̂̆́ȩ̶̴̧̡̘̘̖͔̯̘̖͕̤̼͎̯̐̏ͮ̾ͦ̇w̶͎̜̳̗̻̹̩̰̖̘̫͊ͥ̍̂͊̾͒͒͂ͧͨͭ̔ͭ̌̕͟ͅͅs̸̸̘͓͓̪̝͖͕̻̝̜̦̤̺̩͈̟͇ͦ̊͌ͪ̿ͩ̀̌ͯ́̋ͤ̾͂́̉̔͛́̕r̵̡̧̻̱͙̫̙̤͈̖̣͇̿̽̾͊́͟f̸̷̙̥̣̪̻͔̘͙̠̰̞͚̩̭̲̊̂̆̒ͪ͐̇͛̅̿ͯ́ ̷̷̤͎̬̲̬͈͎̮̱̞ͯ͐ͭ̄̈̋̇͋ͨ̊̓̄̑͊́̚s͂ͬ́͗̀҉͏̼͓̠̟͕f̍̎͂̈́̈ͪ͆͗̅҉͓̙̬̹̥̟͎͉̟̲̤̻̖̟̭͔̗ṣ̴̷̷̨͙̣͈͉͓͙̲̠͚͖͍̹̪̭̻̼̃̇͆̌͂ͯ͌̌̒͑͊̊͗̿͒́̚d̴̳̖̬̞̲́ͨͭͭ͛ͬ̊̃ͩ͒̕͞͡f͙̯̭̟̹̫̳̺̟̟͕͔̜̟̘͍̞͍͋̆ͦ̄̄̓̆̏͆̇̐̚̕͘w̢̜̯̩̲͓̯̭̝̬͆̈́ͭͧ̋̾ͭ̌̀̚̕͞s̷͕̗͖̱̗͓̰̈ͧ̅̔͛ͤ̅͑̀͢ͅe̷̵̢͙̩͚̯̯̰͓͖̠̖̐ͭ̐͗̅͒͐̓̋̉̀ͨ͋̆̐ͨ̍̕͟fͬ̊̋̆͊̇̂ͮ͊ͣͪ͆ͧͯ̃̔̚͡҉̷̝̰̰̲s̶̵͈̣̥̹͍͉̦̠̺̗͚͕̱̠ͯ̄̈́ͭ̃͋͆ͯ͠͞͝ͅd̵͇̖̬͓̦̼̜͚͕̹͇̹̟̘̱̖̅ͬ̈́ͥͭ̉̋̃ͨͩ̃ͤ̐͘f̡̈̓ͯ͋̑ͨͬ̉̈́҉͙͓̺̻͕͇̭̲̖̠͈̜͔̬͕̳̝̪̀̕͡w̷̼͖̙͇̼̭̙̞̫̳̩̦̤̱͒ͬ͒̾̔̌͊͋ͣ̚͟ę̗̬͖̩̗̬̔̑ͧ̿ͫ̐ͪͨ̒́́̕͝f̡̢̬̳͔͕͈̙͚̜ͣ̀̆́ͥ̌̇̿̐r̶ͪ̃̏ͭ͌̒̐̚͘͡҉͕̬̦̜d̷̦̟̭̖̝̭̖̜͙͕͉̋̑ͪ͌̇͆ͫ̽͂̒ͧ͐̌ͥ̅͛ͦͣ̀͜ͅͅs̶̸̥͈̝͚̮͙̺̮̘̟̳͇̻̺ͪ͒ͫ̆ͥ͐̈͑̽̈̌̎̓ͯ̌̓͋̚͠͡f̴̛̛͈̥̬̱̗͖̟̮͉̫̯̫̯̲͒̋̊͂̏ͥ̃ͣ̔̋ͯ̚͘ ̶̶͉̻̝̘̲̪̼̰̻͓͙͖͙̹̻̺̘͍͒̍ͯͪͪͨͩͯ͆̂ͭ̐ͩ͆̿̿́ͅdͤ̐͑̑ͫͨ̍̍̎͒̕͠͏̩̱͎͓ͅf́͑̆ͮͪ̾̍ͬ̉̑̿ͩ̈́̃ͭ̚̚̚҉͓̳̣̼̟̟̖̪͕̭̤̝͇̯̜̣̀͜͝s̴̨̩̝̖͎̆͐̏̿̐͗̓s̶̢̨̙̹̟͈͙͔͕̯̳̗ͨͨ̓̿͘ͅe͙̠̝͙͖̥͉͇̱͈̠̹̤̗̳̦͈͙ͯͭ̏̐̃ͪͤ͂ͧ̈̿̇̓̆̏̂̾̀͜f͖̯͖̫͈̙͉̳̱̞̰͓̞́̃͋̽̽̅̍́͂̂̊̍ͣ͌ͣͩ͜͜͡ͅs̅͒̃͛͗҉̻̜̩̘̫̤̘̻̼s̜̠̲̱ͦ̓ͬ̑ͥͯ̅̐̃͂̈ͮͭ͛̄̒̐͜ẻ̷̴̷̢͕͈̟͔͍͗̉̈̆̄̇͐͒̈́ͬ̂ͬ̀̈̓͒̚f̶̻̺̟̟̘̠̠̥̝ͩͥͣͫ̀̕͡͠ͅͅd̷̢̪̻͓͇̖̮͉̹̖͍̣̦̳̱͍̭͇͆̓͑ͭͯͭ̈́̍̚ş̴͎̬̩̠̳̱̐̐̄̍̓ͭ͐ͦ̄̓͑͒͜f̸͛ͣͯ̎͗̉̿͏̯̲͎̮̤̫̘͕̜̟̲̼̣͉ ̛̖͍͖̺̱͙̮̞̼́̔ͮ̿͟ͅą̢̖̮̟̩͉͓͂ͯͮ͂̍͆̅̿ͨͤ͑ͤ̀̅̒͊̇̚̕͝j̵̮͚͕̫̱͓̰̝̖̠̺͙͖͍̱̪̱̋ͩͥ̀ͬ̄̂̀̒̌̊̿̄̒͆̚̚͝s̡̖̫̜̞̦̏ͧ̿ͭ̒ͩ̀̏ͪͪ̐̈ͣ͠h̑̈́ͬ̏̓̽̉̎̾͘͠͏̸͚͙͇̼͇͖̺͇̙̗͔̝̪dͣͨ͂͋̄ͩ͆ͮͨ̃ͣ͌͏͏̡͟͏̞̗̜̠͈͇͖̜̗̥̣̜͚f̴̡͒̆ͫ́̇̌͏̨͙̜̩̱̩̟̥̲̝̟̮̱̱̬͓j̵̠̪͖̝͎̼̳̭͇̩̙̹͎̽ͪ̏ͯ̔̀ͮ͂ͧ̔͊̑͆̌͜͠h̨̎̿̉̌͏̴̴̰͙͕̲͙͓̲̱̝̖̀d͆̌ͨͤ͆̍͐ͣͩ͂͐̋͞҉̴͘҉͇̮̠̳͙̣̝̺̙̩̙͖f̷̧̪̮̭̣̯̫̜͆͒̑͊̿ͤ͌̾̎͑͋͠g̵̙̱͍͚͇̮͎̩̰̖͚͔̯̮̝̘̣̽ͮ̓̉͆͠j̹̠̤͖̳̦̳̻̺̬̩̼̮͉͍̗͉̣̆́̋ͫ͑ͩ̀̇̈̎́̀̚͜ͅẖ̵̴̴̢͔͕̞̹̟͙̭̱̜̝̣͔̟͍̱̱ͯ̀͊̂͊ͣ͂̇̀̇̌͑͜e̛̤̩̰̹̯͚̲̼̜̝̘̟̺̺͍͚ͮ̃̽͑ͥͩ͋̌̊ͦ̎̚͟ͅd̨͕̜̹̲̺͎̫͐͋̃̓̈̓͌̽̿̒̀͘g̎̿̽̊̅̈̾̿ͥͩ̂̽̾ͨ̿͌̾̀͏̤̰̬̱̞̼̮̼ḩ̴̟͕͇̠̣͙̙͉̫̹̳̰̝̟͉̄̆ͤͦ̑̒ͬͩ̏̽̉̽̏ͦͦ́͠ ̓̔̒̐̔̒̓͆̅̈́͏̢̣̱͎͕͔̼͎̰̘̖̘͈ͅj̛̣͓̤͖̊ͣͣ̒͐̄͗̏ͤͫ͒̓̾̑̽͐̾͆́j̲͕̘͓͓̑ͬ̓̈́̽̀́͝f̨ͧ͊̂̓͏̞̝͈̦̗̩̺͙̥͇͘g̴̘̪̺͉̻̳̒ͤ̉̅̎͊̌̚j̶̝̙͙͍̦̹̳̥̓̑͂̔̇̒ͬ̈ͮ̇ͯͣ́̚͘͡k͌ͬ͋͋͜͏̣̹͈̗͍̘̼̰d͒ͣ̈̃ͯ͋̕͠҉̩̲͎̗̞̘̻͉͚̼ṣ̦̱͖̮̤͔͚̣̙̤̩͎ͯͫ̈́̓̆ͩ̌͑ͯ̏͛ͥ̈́́́h̸̢̛͙̪̻̭̩̮͉͈̟̐͂͋͛̏͒ͪ͆̂̃͌̾ͩ̽̌ͦ̋̀͘f̴̢̤̼̟̺͙̌ͦ̅ͭ̊̍͌̽͋͒ͩ̇͜ ̭͔̻͇̺̓̍͒̌̏̈ͣ̔͂ͤ̀̽̊͢͝k̷̡̡̡̛͈̹̟̳̟͓̩͎̼͓̲͍͓̭̥͗̍̔͆ͯ̀͋̌ͯͪ̓j̢̡̗͓͔̞̄͋̚̚͟h̻͚̝̗͚̦͓̤̠͚̪͓͖̳ͨ̓ͫ̍͐͛̈́̊͜͠d̻͚̗͓̙̫̗̯̼͛̀͊ͫ̆̍̔͐̄̀̇̌̃̎͟͟͟͞͡f̡̱̖̰̥͈̜͍̟̗̭͈̠̞̮̙̫͎̅́ͫ̏̽́̍̈͋̌͂́̐͆ͮ́͟͡h̡̩̩̥͎̑ͬ͋̊̓͡ḑ̴̭̩̟̮̮̗̮̥̭̠̣͉̦̇̀̊̔̑̓̎͘͠h͕̲̞̮̱͕̓͊̿͐ͬ̃͛ͪ̄͛͊̂̑͌̀͘͟f̷̺̺̝͓͓̯͕̝̟̼̗͚̺̫͒̃ͧͪͩ̈́ͬ͢h̴̴̛̫̖̰͍̟̣͉̖̤̗̜̫̩̺̘͕ͪͪ̾͋͗ͧ̌ͪ̂͑̄ͧͤ̒͋̄̃ͪ̚j̡̍̏̀ͮ̽҉̨̥̺̥̣̪̟̠̥̜̲̳̻͕̥̤d̿ͭ̊̽̄̚҉̢̠͕̝̞͚̤̳̮̣͍̫̲͉̝̣̫̖̯̀s̴̨̞͖͇̹͇̤̯̯̼̟͙̼͒͊̏̔ͨ̍̇͟h̴̛̳̰̻̘͓̼͙͚̻̦̣̱̥̫̭̑̿͐̀͂̑̓͗̉ͪ̓̈͆ͫ̑͘͡g̶̡͈͈̯̥̘͙̤̙ͮ̔͐̇̒͌̿̈́̌́́dͩͩͥ̔͛̒ͥ̀̿ͣ̋͊̊̂̿̇ͬ́͟҉͡͏͇̝̭̪͖̪̥̥̯̠̫̤͓̘̮̜̫ͅs̵͈̥͖̼̬̬͈̥̱̻̟̹̍͂̊ͪͣ̐̓͊ͪ̿ͥͪͅͅh̵̨̙̠̭̭̙͓̟̩̯̰͔̝̻ͤ͐͗̌̊̂ͫ̔ͧ̀́͝j̸̶̥̳̗͎̩̞͖͑͆̊̑̇ͪ̓́̃́̀̔̔͒̃̋͛͆͟͢͟ ͦͪ̑̐ͭ҉̗̙̮̝̯̱̲̟̱̝͎͞͞g̶̶̋̀͛̒ͬ͑̇̋ͫ̅ͧ̔ͪ̑̎͏̡̥̪̪͕͕d͖̻̩͉̜̬̖̣̄́́ͩ͂͌́́̚͘͢͝s̶̨̛͉̣͖̙̥͉͙͙̖͓̦̯̹͕̳̲̤̯͗ͦͯ̇̃ͬ̀ͬͥ̂̓̚ͅh̟̱͚͍̲̬̪͉͇̰̝͇̳̤̋͐̾ͬ͐̎͒̂ͣ̓ͭ͘̕h̨̿ͯͪ̈́̀͏̴̘̪̪͓̰̦̥͖͎̯̩̤j̴̬̩̝̣͚͇̻̞̤͎̙̙̲͇̱̹̊͐̇̄͊ͩͧͧͩ̒̌͆̚̕͡ģ̥͕̙͕͚̘̳̙̼̘̳̫͈͈͛͐ͨͦ̏ͧͬͭͫ̔̂̏͒̂̄͋ͨ̿̊͟ͅj̵͌̉̊́ͩ̆ͦͫ̔́̈̃͛͊̇̀͏̩̝͖͉̖͎̗k͌̆̽ͬ̋̇҉͍̙̫̥̥̯̼͈̺̮̹̹̻̰̙́͟ͅf͆̀ͬͭͥ̾̓͏̟̪͉̹͓̺̤͙͕̹͙̩͔͈̝̪̳̳̥k̡̛̮͈͖͓̱̹̗͙͉͚̋ͭͦ̾ͮ͑ͥͦͯ̅͗j̀̇ͤ̚҉̜̮̳̞̖̬̝̣̼̘̰ͅḓ̵̛̬̙̼̥̞ͬ̋̅͒̽ͪ́́f̧̼̞̭̟̫̠̮͓̟̱͍͓͔̝͙͌ͪ̉͛̈́̀̚͟͝ͅͅh́͋ͪ͋̀͆ͬͧͪ͛̐͞͏̸̷̙̞͉͇̳̰̭̗̳g̸̡͑̇̄̊͏̸̧͚̜̬̪̹̝̜̺̼͎̘̘̳͉j̵̴̧̠͇̯̳̤̥͇͇̯̣͕͓̩͚͇͕ͯ̆̂̉ͨͭ͟ș̛͉͚͎̲̟̪͙̣́͋̇ͤ̏̓ͫͤ͑ͩͯ̓̅ͭ͛͢a̸̴̎̈́̎ͦ͐̒͒͏̵̴̭͉̻̦̳̯͖͎h̆̆̍͗ͮ͌̄̇̌͌̽ͨ͐͛̇̽͛҉̘͎̜̮̖͔̯͓͉̟̻̪͉̖͇d̷͙̲͙̖̣̬͔͇̣̯͔̼̖͎͎̉͛͑ͮ̽̅̾ͪ͗ͦ͒̃̓ͯͦͪͭ̊̀͘ḧ́̊̓̓͋̈́ͧͧ̏̿̏̂̐ͯ̐̀̋͏̵̕͏̡̰̦̖̼̺͎̪̦f̶̸̨̪̝̰̯͇̝̬̞̠̪̬̝̯̦͚͛͗ͭ́̓̆̀ͩͣͯͣ̔ͪ̈́ͦͭ͞d̨̡̛͉̼͈̋̎̄ͮͦ̓̓̇̈́̏ͬ̉̾̇̆̕̕h̊̈́͂̔̍ͯ̽͏̢̦̮̹̲̟̬̦̻͞gͨ̃̄̈҉̸̠̲̼̼͇̻͕͚͓͙̮͉̜͔͓̺͈͍s̶̨͕̯͙̜͈̰̦̤̪͍̠͉̤̝͔̫͊̒̅̀d̝͔͖̭̟͉̪̝̭̰̹̪̺̃̍̍͞͞͞a̢̯̠̪͖̰̫̿ͪ̈́̐̓̑̾̅̄ͫ̐͡h̷̗̙̭̰̲̮͈̻̖̘̫̩̐̉ͦ̃̒̾ͣ̐ͨ̆ͫ̍ͭ͂͢h̡̞̱̳̝̞̜̺̞͇̬̦͇̱̦̲ͮͭ̔̉ͬ̿͊̄ͭ͋́́ͬ̓̚̕͜͢͡ͅd̵̨̧̠͚̯̹̭̘͇̣̠̻̘̠ͦ̏͐̆ͥ̐͛ͮͩ̍͘͝f̷͕͕̩̗̼͓͚͎̪̤͕̦̟̣̱̤̫͛͌͌̓̓͐ͪ͡h̸̸̖͍̦̯̹̤́͂͊́͞g̶͕̹͔̝̞̻̰̰̣̳ͮ̓̋̌ͪͤͨ̋̚͠j̅̓̑ͨ̂̃͐̈́ͫ̌ͬͩ͊̆ͨ͂̌͂̍҉̸̷̨̡̠̱̖̱̦̬͓̮ͅf̶͓̫̱̲̝̺̟̟͚̗̄̊ͥ͒ͬ̒̓̌̐̒̅̌ͦ͛̚d̨̛̝͓̼͕̭̘̘̤͎̘̓͗̌͡h̸͛̃̓͌͐͗̿̒̃̓̍́͋̀͏̷͔̯̬̬͙̹̤͇͎͖̠̘̻͘ṫ̌̓ͦ͆̿͊ͣͪ̐̈̊͑̏ͪ̆͘͏̸҉̗͚̣̘̦̩͈f̢̧̫̬͖̬̪̭͎͓̟̜͖͉̋ͩͨ̀̃ͯ͗̽ͪͫ̈̿̇̕͜h̻̮̲̬̿ͯͭͥ͊̎ͧ͆̌ͬ͊̇͒ͮ̅̄͘j̵̵̧̱̪͈̼̯͕ͩ̽̀̃̇͋̅ͦ̂ͭ̑ͩͬ̅̆̈͠b̨̨̳͍̩̖̘͈̠͓̘͈̩̠͑͊̉ͨ̌̕͞͝ͅ ̶̢̤̣͇̗̮͚͈̳̜̟̼̓ͣͭ͐̍͋̾͐͋̐͗̆̾ͤ͢");
            crashComputer();
                System.exit(0);
        }
        StopMusic();
        Scanner reader = new Scanner(System.in);
        System.out.println("Would you like to play again?");
        String command = reader.nextLine();
        command = command.toLowerCase();
        if (command.equals("yes")){
            ArceusBattle = false;
            room =0;
            dig = 0;
            rescue = 6;
            LucarioHealth = 344;
            GalladeHealth = 340;
            ArceusHealth = 999999999;
            rescueCalled= false;
            trap = false;
            PokéBall = 0;
            PokéBallTaken = false;
            PokéBall2Taken = false;
            Lucario = true;
            sword = false;
            swordTaken = false;
            iPhone = false;
            iPhoneTaken = false;
            iPhoneExplode = false;
            iPhoneFuse = 1;
            Galaxy = false;
            GalaxyTaken = false;
            wall = true;
            chopper = false;
            Arceus = true;
            Pikachu = false;
            Gallade = true;
            GalladeCaught = false;
            System.out.println("You wake up inside a dimly lit house with no doors.\nThere is a wall towards your west and south.");
            System.out.println("type 'help' for instructions");
        } else {
            System.out.println("Shutting down...");
            crashComputer();
            //PowerOff();
            System.exit(0);
        }
    }
    //</editor-fold>
    @SuppressWarnings("SleepWhileInLoop")
    //<editor-fold defaultstate="collapsed" desc="Commands">
    public static void main(String[] args) throws InterruptedException, LineUnavailableException{
        System.out.println("Initilizing TextAdventure by Levon...");
        Thread.sleep(2000);
        System.out.println("Be sure to check out my YouTube channel\nhttps://www.youtube.com/c/ToonLinkPlaysOfficial");
        Thread.sleep(1000);
        System.out.println("It is recommended to enable sound.");
        Thread.sleep(500);
        System.out.println("Commands are case insensetive.");
        Thread.sleep(500);
        System.out.println("You wake up inside a dimly lit house with no doors.\nThere is a wall towards your west and south.");
        Thread.sleep(500);
        System.out.println("type 'help' for instructions");
        String command = PromptUser();
        while (!(command.equals("qu"))){
            OUTER:
            OUTER_1:
            OUTER_2:
            OUTER_3:
            switch (command) {
                case "mute":
                    if (Mute){
                        Mute = false;
                        System.out.println("Sound unmuted.");
                    } else if (!(Mute)){
                        StopMusic();
                        Mute = true;
                        System.out.println("Sound muted.");
                    }
                case "blue":
                    Blue();
                    break;
                case "music":
                    System.out.println("Opening web browser...");
                     if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
                    try {
        Desktop.getDesktop().browse(new URL("https://www.youtube.com/channel/UCVSAhAXQz4rsYCpIi404OWA").toURI());
    } catch (IOException | URISyntaxException e) {
    }
                    break;
                case "amazon":
                    System.out.println("Opening web browser...");
                     if ((clip != null)&&(clip.isRunning())){
            clip.stop();
        }
                    try {
        Desktop.getDesktop().browse(new URL("https://www.amazon.ca/gp/product/B01EZ832ES/ref=ya_st_dp_summary").toURI());
    } catch (IOException | URISyntaxException e) {
    }
                    break;
                case "youtube":
                    System.out.println("Opening web browser...");
                    try {
        Desktop.getDesktop().browse(new URL("http://www.youtube.com/c/ToonLinkPlaysOfficial").toURI());
    } catch (IOException | URISyntaxException e) {
    } 
                    break;
                case "eagle owl":
                    System.out.println("Opening web browser...");
                    try {
        Desktop.getDesktop().browse(new URL("https://www.youtube.com/playlist?list=PLKzsMcY_iplgn9aAsVaNE4ZfoHXCM6MPi").toURI());
    } catch (IOException | URISyntaxException e) {
    } 
                    break;
                case "cisco certified":
                    System.out.println("You find a book with a bookmark in it.");
                    Thread.sleep(1000);
                    System.out.println("You open the book to chapter 7.");
                    Thread.sleep(1000);
                    System.out.println("You read about the great fiber optics.");
                    Thread.sleep(1000);
                    System.out.println("You are now Cisco Certified.");
                    break;
                case "stop sound":
                    StopMusic();
                    break;
                case "heal pokemon":
                    if(room == 0){
                        if(!(Lucario)){
                            LucarioHealth = 344;
                            PokèHeal();
                        System.out.println("Pokémon healed.");
                        } else if (!(Lucario)&&(!(Gallade))){
                            LucarioHealth = 344;
                            GalladeHealth = 340;
                            PokèHeal();
                        System.out.println("Pokémon healed.");
                        } else {
                            System.out.println("You have no Pokémon to heal!");
                        }
                    } else {
                        System.out.println("You can't do that here!");
                    }
                    break;
                case "sound test 5":
                    if(DebugMode){
                    ArceusBattleMusic();
                    } else {
                        System.out.println("This is a debug feature! Please enable debug mode!");
                    }
                    break;
                
                case "sound test 6":
                    if(DebugMode){
                    Charging();
                    } else {
                        System.out.println("This is a debug feature! Please enable debug mode!");
                    }
                    break;
                case "sound test 7":
                    if(DebugMode){
                    KeyItemGet();
                    } else {
                        System.out.println("This is a debug feature! Please enable debug mode!");
                    }
                    break;
                case "sound test 12":
                    if(DebugMode){
                    KeyItemGetAlola();
                    } else {
                        System.out.println("This is a debug feature! Please enable debug mode!");
                    }
                    break;
                case "sound test 8":
                    if(DebugMode){
                    PokèHeal();
                    } else {
                        System.out.println("This is a debug feature! Please enable debug mode!");
                    }
                    break;
                case "sound test 10":
                    if(DebugMode){
                    TrainerBattleMusic();
                    } else {
                        System.out.println("This is a debug feature! Please enable debug mode!");
                    }
                    break;
                case "sound test 11":
                    if(DebugMode){
                    TrainerBattleMusicAlola();
                    } else {
                        System.out.println("This is a debug feature! Please enable debug mode!");
                    }
                    break;
                case "sound test 4":
                    if(DebugMode){
                    WildBattleMusicAlola();
                    } else {
                        System.out.println("This is a debug feature! Please enable debug mode!");
                    }
                    break;
                case "sound test 3":
                    if(DebugMode){
                    WildBattleMusic();
                    } else {
                        System.out.println("This is a debug feature! Please enable debug mode!");
                    }
                    break;
                case "sound test 1":
                    if(DebugMode){
                    PokèCatch();
                    } else {
                        System.out.println("This is a debug feature! Please enable debug mode!");
                    }
                    break;
                case "sound test 2":
                    if(DebugMode){
                    PokèCatchAlola();
                    } else {
                        System.out.println("This is a debug feature! Please enable debug mode!");
                    }
                    break;
                case "sound test 9":
                    if(DebugMode){
                    PokèHealAlola();
                    } else {
                        System.out.println("This is a debug feature! Please enable debug mode!");
                    }
                    break;
                case "sound test":
                    if(DebugMode){
                    System.out.println(ANSI_RED+"Error: missing argument. ex: sound test <id>"+ANSI_RESET);
                    } else {
                        System.out.println("This is a debug feature! Please enable debug mode!");
                    }
                    break;
                case "cloud":
                    System.out.println("Opening web browser...");
                    try {
        Desktop.getDesktop().browse(new URL("https://github.com/ToonLinkPlays/TextAdv").toURI());
    } catch (IOException | URISyntaxException e) {
    }
                    break;
                //case "crash":
                //    crashComputer();
                //    break;
                case "map":
                    System.out.println("Opening web browser...");
                    try {
        Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/0Bx7ZzFq7LnISQXFjWTlHYW1lZDQ/view?usp=sharing").toURI());
    } catch (IOException | URISyntaxException e) {
    }
                    //System.out.println("Map availble here:\nhttps://drive.google.com/file/d/0Bx7ZzFq7LnISQXFjWTlHYW1lZDQ/view?usp=sharing");
                    break;
                case "random":
                    if(DebugMode){
                    int gmove = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    System.out.println(gmove);
                    } else {
                        System.out.println("This is a debug feature! Please enable debug mode!");
                    }
                    break;
                case "crash":
                    crash();
                    break;
                case "debugging mode":
                    Scanner reader = new Scanner(System.in);
                    System.out.println(ANSI_RED+"WARNING: Debug mode is for testing purposes only. Are you sure you want to enable debugging mode? (yes/no)"+ANSI_RESET);
                    String dbg = reader.nextLine();
                    if (dbg.equals("yes")){
                    DebugMode = true;
                    System.out.println("Debugging mode enabled.");
                    }
                    break;
                case "cheat":
                    CheatMode = true;
                    System.out.println(ANSI_RED+"Cheat mode enabled.");
                    Thread.sleep(6000);
                    System.out.println("The almighty Arceus teleported to your location!");
                    Thread.sleep(3000);
                    System.out.println("The amlighty Arceus is holding a sign that says you are a disgrace to gamers everywhere!");
                    Thread.sleep(3000);
                    System.out.println("The almighty Arceus used Hyper Beam on you!");
                    Thread.sleep(4000);
                    System.out.println("You died!");
                    Death();
                    break;
                case "help":
                    PrintInstructions();
                    break;
                case "board chopper":
                    if ((room == 7)&&(rescue == 0)){
                        if ((Pikachu)&&(GalladeCaught)){
                            if (!(DebugMode)){
                            Chopper();
                            } else {
                                System.out.println("The pilot calls you a cheater and forbids you from boarding his chopper!");
                            }
                        } else {
                            System.out.println("The pilot looks at your Samsung Galaxy S7 Edge and says that you're missing something.");
                        }
                    } else {
                        System.out.println("There is no chopper to board!");
                    }
                    break;
                case "bribe pilot":
                    if ((room == 7)&&(rescue == 0)){
                        if ((Pikachu)&&(GalladeCaught)){
                            if (!(DebugMode)){
                                System.out.println("Nothing happened...");
                            } else {
                                System.out.println("You offer the pilot your phone in exchange for a lift.\nThe Pilot then agrees to let you in his chopper.");
                                FChopper();
                            }
                        } else {
                            System.out.println("The pilot looks at your Samsung Galaxy S7 Edge and says that you're missing something.");
                        }
                    } else {
                        System.out.println("There is no chopper to board!");
                    }
                    break;
                case "delete emails":
                    crash();
                    break;
                case "attack on trump":
                    System.out.println("An iPhone 7 mysteriously appeared next to the wall towards the west of the house and exploded.");
                    wall = false;
                    break;
                case "kill self":
                    System.out.println("You must specify how you want to kill yourself.");
                    break;
                case "pokemon go":
                    if (Galaxy){
                        if (Pikachu) {
                            System.out.println("You play Pokémon GO for a while but you don't catch any Pokèmon.");
                        } else if ((Pikachu == false)&&(room != 6)){
                            System.out.println("You play Pokémon GO for a while but you don't catch any Pokèmon.");
                        } else if ((Pikachu == false)&&(room == 6)){
                            System.out.println("You play Pokémon GO for a while and catch a Pikachu.");
                            Pikachu = true;
                        }
                    } else if (iPhone) {
                        System.out.println("You need a phone that isn't dead!");
                    } else {
                        System.out.println("You don't have a phone to play Pokémon GO!");
                    }
                    break;
                case "kill self undefined":
                    System.out.println("A mysterious glitch that resembles MissingNo appeared and made you glitch into nothing!");
                    System.out.println("I̢̢͎͍͓̬͖̰̦͔͉̪̻̗͉̦͕ͮ̔ͫ͆́͘͠ͅ ̸͗͆̿̔ͮ̈́̐͐ͪ̾͑̈͋̋̐ͬ̓͌́͢҉̳̟͓̣͕͙̺͕̻̙̞̤̗̹̗͇̼̟ͅW̴̷̸̛͛ͮ̔͊̽̊̇͐̇̃͛̒̆ͯ̊̐͊҉̳͈̪͉̯̱̖͔̤̥̘̝̣̣̣͕ͅI̷̵̳̖̺̥͓̮͚͍͇̙͎̯͍͓̗̪̋ͩ̐ͣ̅ͨ̔͊̾̚͡Ļ̴͚̜͓͍̥͈͎̥̼̺̻ͩ͑̒̆̈̅̓͑͊ͩ͌̕͘ͅL̶ͪ͂͑ͩ͛̾̽͗҉̡͎͉͙̲̪̪͔̣̣̯̳̠͍̱̘̰͖͢ͅ ̴̸̡̨̼̘͉̠̼̟͖̞̣̳̂̄̈́ͩ̋ͭ̐͗͑ͧ̊̎͊̒ͥ͊̐͒̌K̅ͭ̈́ͭ̿̈̉̊͂̊̓ͮ̀͏̰͕̥͇͍̟͖Ì̛̞̩̳̠͖̰͇̻̺̟͖ͨ̐ͤͯͭ͐̒̅ͪ̄̃ͫ̄͢͠͠Ḻ̢̨̞̫̟͂͂̅ͬͯͫ̊̌ͨͦ̌̒͒L̢̯̺͇̹̇ͤ̈̏ͣ͆̇͌͢ͅ ̸̧̨̗̥̮̝͎̻̲̻̞̮̹̯̐ͩͫ̈̈̓͌ͪ̒͊̌́͞Y̨̢͇͇̜̞̹͇̰̠̜͖͉̹͇̥̗͗̿̈̃̊̉ͣ̆̿ͥ̈́͌ͮ̆̉̇ͭ̒͘͡Oͦͩͦ̎̃ͮ̾ͪ͢͏̯̣̦͈͍͍͓̼̯͖͍̩̹̬͢͜͞U̱̯̗̱̭̦̭̝͉͔̰͌ͧ͗͗͐̆ͮ̋̓̒̀͗̅́͢ͅ");
                    System.out.println("F̶̝̪̬͕͔̖͚̻͔̠̙̤̼̜͈̬̞̮͠È̡̜̣͉̲͖̥̩͙̱̘͔̳̘͉̕͠Ȩ̵̷̢̝̖̺̪̤̩̖D̸̞̹͚̼͈͇̠̭̩̻̬͇̖̞̺̜̲́͝ͅ ҉̵̯̦͍͔̥͈͚͓͎͔̹͈̣̠̰̲̼͘M̴̴̶̨̛̤̥̫̠̟̘͚̹͍̹͙̞͕E̲͔̺̫͢͞ ̨͔̥͉̗͉͇̜̩̲̺̖̙̼̫͙́̀̕Y̨͙̜̣̯̗̘͜͞Ǫ͓̦̫̬̙̖̬̺͘̕͟͢ͅU̥͈̤̳̻̙͈̠͖̟̞̼̭͈̟̬͢͜͢͝͡Ŗ̢̭̤̝̬̖̯͙͕͖̜̠͟ͅ ̧̗͔͖̪̰̯̯͔̣͎̺͔͈͖̕Ş̶̝͔̻̝̳̺̜̫̞̻̠͙̯̞̝̰͠Ờ͏̡̢͚͚̘̩̻U̲̱̭̣̮̹̖̜̬͈̻̖͟͝͝ͅĻ̝̳̮̜͎̤̘̖̼̱͠");
                    System.out.println("Y̭̪̦͇̩͓̼̣̥̲͔͚͕̭͘ͅǪ̸̵̺̭̩̠͉̗̥̞̖͍͙̻͉̗̬̬̺́͠Ư̺̘̲͍̙͚̫͝R̷̨̰̬͍̫̦͘ ̢̛̙͚̫̩̠̦́̀S̠̙͍̪̻̞̜͖̯̙̥̲̮̮̟̖̠͇͟͜͞O̷̳̬͚̪̝̥̦͓͇͉̤̖̼̭͓͎̲̭͍͟͜U̦̪̠͉͔̯̲̳̤͉̥̳̙̥͚͢͡͠L̵͉̝̪͍̭̥̜̰̜̘͍͙̜͎͘ͅͅͅ ̛͉̰̠͇͕͔̀͝ͅI̶̸̭̠̟̭̲̳̯̺͇͔͍̰͕̫͔̞͢Ş̷̰͙̤̞̲̞̲̖͍̖͈͚͖͖͎͈̮̘͜ ̕͏̪͉͕̼͓͜Ḿ̴̡̞̬̦̝̟̬̙̠͎͖͟͞ͅI̶̸̠͚̬̤̼͉̦͝N̯͎͈̞̤̘͎͟͢Ȩ̢̝̣̤̬͍̗̫̭̳͕͙̝͍̟̞͕͚͕́͡");
                    System.out.println("You Died!");
                    //Runtime.getRuntime().exec("shutdown -s -t 30");
                    //System.out.println("App Killed");
                    Death();
                    break;
                case "kill self iphone":
                    System.out.println("You find an iPhone 7 on the ground.");
                    Thread.sleep(3000);
                    System.out.println("You pick it up and become depressed because there is no headphone jack.");
                    Thread.sleep(3000);
                    System.out.println("You tell Siri that you're felling depressed and she agrees to put you out of your misery.");
                    Thread.sleep(3000);
                    System.out.println("The iPhone exploded!");
                    Thread.sleep(1000);
                    System.out.println("Pieces of glass from the explosion pierce your skin!");
                    Thread.sleep(1000);
                    System.out.println("The explosion set you on fire!");
                    Thread.sleep(500);
                    System.out.println("You died!");
                    Death();
                    break;
                case "kill self harambe":
                    System.out.println("You think of Harambe and you wish he was still alive.");
                    Thread.sleep(3000);
                    System.out.println("You feel depressed without Harambe.");
                    Thread.sleep(3000);
                    System.out.println("You want to join Harambe.");
                    Thread.sleep(3000);
                    System.out.println("You decide to kill yourself to be with Harambe.");
                    Thread.sleep(4000);
                    System.out.println("A rope appears out of nowhere and you decide to hang yourself on a nearby tree.");
                    Thread.sleep(4000);
                    System.out.println("As you vision fades, you yell out 'Harambe I'm coming to join you!'");
                    Thread.sleep(4000);
                    System.out.println("You died!");
                    Death();
                    break;
                case "win":
                    System.out.println("Sorry, winning isn't that easy.");
                    System.out.println("A mysterious Pokémon appeared and used psychic powers to stop your heart!");
                    System.out.println("You Died!");
                    FPowerOff();
                    //System.out.println("App Killed");
                    Death();
                    break;
                case "kill self poke":
                    System.out.println("A mysterious Pokémon appeared and sliced you to pieces!");
                    System.out.println("You Died!");
                    //System.out.println("App Killed");
                    Death();
                    break;
                case "kill self sword":
                    if (sword){
                        System.out.println("You stab yourslef with the sword and slowly feel relieved of your burdens.");
                        Death();
                    } else {
                        System.out.println("You don't have a sword!");
                    }
                    break;
                case "quit":
                    Quit();
                    break;
                case "hh//ee//lp":
                    PrinthInstructions();
                    break;
                case "helllp////eeee////lp":
                    PrinthhInstructions();
                    break;
                case "where am i":
                    if (room == 13){
                        System.out.println("You are in room ???");
                    } else{
                        System.out.println("You are in room "+ room);
                    }
                    break;
                case "plug in iphone":
                    if (iPhone){
                        if (room == 0){
                            System.out.println("You plug in the iPhone and it begins to charge.");
                            Thread.sleep(7000);
                            Charging();
                            Thread.sleep(1000);
                            System.out.println("You notice that the iPhone is getting extremely hot.");
                            Thread.sleep(3000);
                            iPhoneExplode = true;
                        } else{
                            System.out.println("There is nowhere to charge the iPhone!");
                        }
                    } else {
                        System.out.println("You don't have an iPhone to plug in!");
                    }
                    break;
                case "plug in samsung":
                    if (Galaxy){
                        if (room == 0){
                            System.out.println("You don't need to charge the Samsung Galaxy as it is at 100%!");
                        } else {
                            System.out.println("You don't need to charge the Samsung Galaxy as it is at 100%!");
                        }
                    } else {
                        System.out.println("There is only an iPhone charger here.");
                    }
                    break;
                case "throw":
                    throwCommand();
                    break;
                case "go east":
                    iExplode();
                    if (iPhoneFuse == 0) {
                    } else {
                        if (trap) {
                            System.out.println("You're trapped! You can't go anywhere!");
                        } else {
                            if (chopper) {
                                System.out.println("You're in the chopper!");
                            } else {
                                if (dig == 1) {
                                    System.out.println("You're underground! You can't move around!");
                                } else {
                                    switch (room) {
                                        case 0:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room4();
                                            break OUTER_1;
                                        case 1:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room2();
                                            break OUTER_1;
                                        case 2:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room3();
                                            break OUTER_1;
                                        case 3:
                                            System.out.println("Trump's wall is blocking your path.");
                                            break OUTER_1;
                                        case 6:
                                            System.out.println("Trump's wall is blocking your path.");
                                            break OUTER_1;
                                        case 5:
                                            System.out.println("Trump's wall is blocking your path.");
                                            break OUTER_1;
                                        case 4:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room5();
                                            break OUTER_1;
                                        case 7:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room6();
                                            break OUTER_1;
                                        case 8:
                                            System.out.println("Trump's wall is blocking your path.");
                                            break OUTER_1;
                                        case 9:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room8();
                                            break OUTER_1;
                                        case 10:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room9();
                                            break OUTER_1;
                                        case 11:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room12();
                                            break OUTER_1;
                                        case 12:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   StartRoom();
                                            break OUTER_1;
                                        case 14:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room13();
                                            break OUTER_1;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            }
                        }
                    }
                    break;
                case "go west":
                    iExplode();
                    if (iPhoneFuse == 0) {
                    } else {
                        if (trap) {
                            System.out.println("You're trapped! You can't go anywhere!");
                        } else {
                            if (chopper) {
                                System.out.println("You're in the chopper!");
                            } else {
                                if (dig == 1) {
                                    System.out.println("You're underground! You can't move around!");
                                } else {
                                    switch (room) {
                                        case 0:
                                            if (wall){
                                                System.out.println("A wall is blocking your path.");
                                            } else {
                                                if (rescueCalled){
                                                    if (rescue != 0){
                                                        rescue--;
                                                    }
                                                }
                                                room12();
                                            }                       break OUTER;
                                        case 1:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }                       room13();
                                            break OUTER;
                                        case 2:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }                       room1();
                                            break OUTER;
                                        case 3:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }                       room2();
                                            break OUTER;
                                        case 4:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }                       StartRoom();
                                            break OUTER;
                                        case 5:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }                       room4();
                                            break OUTER;
                                        case 6:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }                       room7();
                                            break OUTER;
                                        case 7:
                                            System.out.println("Trump's wall is blocking your path.");
                                            break OUTER;
                                        case 8:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }                       room9();
                                            break OUTER;
                                        case 9:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }                       room10();
                                            break OUTER;
                                        case 12:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }                       room11();
                                            break OUTER;
                                        case 13:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }                       room14();
                                            break OUTER;
                                        case 14:
                                            System.out.println("Trump's wall is blocking your path.");
                                            break OUTER;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            }
                        }
                    }
                    break;
                case "go south":
                    iExplode();
                    if (iPhoneFuse == 0) {
                    } else {
                        if (trap) {
                            System.out.println("You're trapped! You can't go anywhere!");
                        } else {
                            if (chopper) {
                                System.out.println("You're in the chopper!");
                            } else {
                                if (dig == 1) {
                                    System.out.println("You're underground! You can't move around!");
                                } else {
                                    switch (room) {
                                        case 0:
                                            if (wall){
                                                System.out.println("A wall is blocking your path.");
                                            } else {
                                                if (rescueCalled){
                                                    if (rescue != 0){
                                                        rescue--;
                                                    }
                                                }
                                                room8();
                                            }   break OUTER_2;
                                        case 1:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   StartRoom();
                                            break OUTER_2;
                                        case 2:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room4();
                                            break OUTER_2;
                                        case 3:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room5();
                                            break OUTER_2;
                                        case 4:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room7();
                                            break OUTER_2;
                                        case 5:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room6();
                                            break OUTER_2;
                                        case 6:
                                            System.out.println("Trump's wall is blocking your path.");
                                            break OUTER_2;
                                        case 7:
                                            System.out.println("Trump's wall is blocking your path.");
                                            break OUTER_2;
                                        case 8:
                                            System.out.println("Trump's wall is blocking your path.");
                                            break OUTER_2;
                                        case 9:
                                            System.out.println("Trump's wall is blocking your path.");
                                            break OUTER_2;
                                        case 11:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room10();
                                            break OUTER_2;
                                        case 12:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room9();
                                            break OUTER_2;
                                        case 13:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room12();
                                            break OUTER_2;
                                        case 14:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room11();
                                            break OUTER_2;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            }
                        }
                    }
                    break;
                case "go north":
                    iExplode();
                    if (iPhoneFuse == 0) {
                    } else {
                        if (trap) {
                            System.out.println("You're trapped! You can't go anywhere!");
                        } else {
                            if (chopper) {
                                System.out.println("You're in the chopper!");
                            } else {
                                if (dig == 1) {
                                    System.out.println("You're underground! You can't move around!");
                                } else {
                                    switch (room) {
                                        case 0:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room1();
                                            break OUTER_3;
                                        case 1:
                                            System.out.println("Trump's wall is blocking your path.");
                                            break OUTER_3;
                                        case 2:
                                            System.out.println("Trump's wall is blocking your path.");
                                            break OUTER_3;
                                        case 3:
                                            System.out.println("Trump's wall is blocking your path.");
                                            break OUTER_3;
                                        case 4:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room2();
                                            break OUTER_3;
                                        case 5:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room3();
                                            break OUTER_3;
                                        case 6:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room5();
                                            break OUTER_3;
                                        case 7:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room4();
                                            break OUTER_3;
                                        case 8:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   StartRoom();
                                            break OUTER_3;
                                        case 9:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room12();
                                            break OUTER_3;
                                        case 10:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room11();
                                            break OUTER_3;
                                        case 11:
                                            room14();
                                            break OUTER_3;
                                        case 12:
                                            if (rescueCalled){
                                                if (rescue != 0){
                                                    rescue--;
                                                }
                                            }   room13();
                                            break OUTER_3;
                                        case 13:
                                            System.out.println("Trump's wall is blocking your path.");
                                            break OUTER_3;
                                        case 14:
                                            System.out.println("Trump's wall is blocking your path.");
                                            break OUTER_3;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            }
                        }
                    }
                    break;
                case "go":
                    iExplode();
                    if (iPhoneFuse == 0){
                        
                    } else {
                        if (trap){
                            System.out.println("You're trapped! You can't go anywhere!");
                        } else {
                            if (chopper){
                                System.out.println("You're in the chopper!");
                            } else {
                                GoCommand();
                            }
                        }
                    }
                    break;
                case "warp":
                    if(DebugMode){
                    iExplode();
                    WarpCommand();
                    } else {
                        System.out.println("This is a debug feature! Please enable debug mode!");
                    }
                    break;
                case "inventory":
                    Inv();
                    break;
                case "inv":
                    Inv();
                    break;
                case "take":
                    iExplode();
                    TakeCommand();
                    break;
                case "use":
                    iExplode();
                    UseCommand();
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
            command = PromptUser();
        }
    }
    public static String PromptUser(){
        Scanner reader = new Scanner(System.in);
        if(DebugMode){
                    System.out.println(ANSI_RED+"WARNING: Debug mode enabled."+ANSI_RESET);
                    }
        if(CheatMode){
                    System.out.println(ANSI_RED+"WARNING: Cheat mode enabled."+ANSI_RESET);
                    }
        while(true){
            if ((rescueCalled)&&(chopper == false)&&(rescue != 0)){
            System.out.println("Moves until rescue: "+rescue);
        }
        System.out.println("What do you want to do?");
        String command = reader.nextLine();
        command = command.toLowerCase();
        return command;
        }
    }
    public static void iExplode() throws InterruptedException{
        if (iPhone){
            if (iPhoneExplode){
                iPhoneFuse--;
                if (iPhoneFuse == 0){
                    System.out.println("The iPhone exploded!");
                    Thread.sleep(500);
                    System.out.println("Pieces of glass from the explosion pierce your skin!");
                    Thread.sleep(1000);
                    System.out.println("The explosion set you on fire!");
                    Thread.sleep(500);
                    System.out.println("You died!");
                    Death();
                    }
                }
            }
    }
    public static void throwCommand(){
        Scanner reader = new Scanner(System.in);
        System.out.println("What do you want to throw?");
        String item = reader.nextLine();
        item = item.toLowerCase();
        switch(item){
            case "iphone":
                if (iPhone){
                    if (room == 0){
                        if (iPhoneExplode){
                            if (iPhoneFuse == 1){
                                System.out.println("You throw the iPhone towards the west wall and it explodes.\nThe explosion made a hole in the wall that is large enough for you to pass through.");
                                iPhone = false;
                                wall = false;
                            }
                        }
                    } else {
                        System.out.println("You can't throw that here!");
                    }
            } else {
                    System.out.println("You don't have an iPhone to throw!");
                }
                break;
            default:
                System.out.println("You can't throw that!");
        }
    }
    public static void CallForRescue(){
        System.out.println("You turn on the Samsung Galaxy S7 Edge and open the phone app.\nYou look through the contacts and you find someone who is a pilot.\nYou dial their number and you ask him if he can give you a lift in his chopper.\nThe pilot agrees to give you a lift in his chopper but he warns you there can sometimes be a Chain Chomp in the area.");
        System.out.println("Rescue is coming! Defend yourself!");
        System.out.println("You hear a Chain Chomp nearby!");
        rescueCalled = true;
        rescue--;
    }
    public static void Rescue(){
        //if ((room == 7)&&(rescue == 0)){
        //}
    }
    public static void UseCommand(){
        Scanner reader = new Scanner(System.in);
        System.out.println("What do you want to use?");
        String item = reader.nextLine();
        item = item.toLowerCase();
        switch(item){
            case "pokeball":
                if (PokéBall != 0){
                System.out.println("There's no Pokémon to catch here!");
                } else {
                    System.out.println("You don't have a PokéBall!");
                }
                break;
            case "lucario":
                if ((!(Lucario))&&(room !=0)){
                System.out.println("You let Lucario out of it's PokéBall.");
                } else if ((!(Lucario))&&(room == 0)) {
                    System.out.println("You let Lucario out of it's PokéBall.");
                    System.out.println("Lucario used Close Combat on the wall!\nThe wall fell down!");
                    wall = false;
                } else {
                        System.out.println("You don't have a Lucario!");
                        }
                break;
            case "iphone":
                if (iPhone){
                System.out.println("You need to charge the iPhone before you can use it!");
                } else {
                    System.out.println("You don't have an iPhone!");
                }
                break;
            case "iphone 7":
                if (iPhone){
                System.out.println("You need to charge the iPhone before you can use it!");
                } else {
                    System.out.println("You don't have an iPhone!");
                }
                break;
            case "samsung":
                if (Galaxy){
                    if (rescueCalled){
                        System.out.println("Rescue is already on the way!");
                    } else {
                    CallForRescue();
                    }
                } else {
                    System.out.println("You don't have a Samsung Galaxy!");
                }
                break;
            case "samsung galaxy":
                if (Galaxy){
                    if (rescueCalled){
                        System.out.println("Rescue is already on the way!");
                    } else {
                    CallForRescue();
                    }
                } else {
                    System.out.println("You don't have a Samsung Galaxy!");
                }
                break;
            case "galaxy":
                if (Galaxy){
                    if (rescueCalled){
                        System.out.println("Rescue is already on the way!");
                    } else {
                    CallForRescue();
                    }
                } else {
                    System.out.println("You don't have a Samsung Galaxy!");
                }
                break;
            case "samsung galaxy s7 edge":
                if (Galaxy){
                    if (rescueCalled){
                        System.out.println("Rescue is already on the way!");
                    } else {
                    CallForRescue();
                    }
                } else {
                    System.out.println("You don't have a Samsung Galaxy!");
                }
                break;
            case "galaxy s7 edge":
                if (Galaxy){
                    if (rescueCalled){
                        System.out.println("Rescue is already on the way!");
                    } else {
                    CallForRescue();
                    }
                } else {
                    System.out.println("You don't have a Samsung Galaxy!");
                }
                break;
            default:
                System.out.println("Invaild item.");
                break;
        }
    }
    public static void TakeCommand() throws LineUnavailableException{
        Scanner reader = new Scanner(System.in);
        System.out.println("What do you want to take?");
        String item = reader.nextLine();
        item = item.toLowerCase();
        switch(item){
            case "sword":
                if ((room == 9)&&(rescueCalled)){
                    if (swordTaken){
                        System.out.println("There is nothing to pick up here.");
                    } else {
                    System.out.println("You pick up the sword.");
                    sword = true;
                }
                } else {
                    System.out.println("There is no such item in this room.");
                }
            case "pokeball":
                if (room == 2){
                if (PokéBallTaken){
                    System.out.println("There is nothing to pick up here.");
                } else {
                System.out.println("You pick up the PokéBall.");
                KeyItemGetAlola();
                PokéBall++;
                PokéBallTaken = true;
                }
                } else if ((room == 9)&&(!(Lucario))){
                    if (PokéBall2Taken){
                    System.out.println("There is nothing to pick up here.");
                } else {
                System.out.println("You pick up the PokéBall.");
                KeyItemGetAlola();
                PokéBall++;
                PokéBall2Taken = true;
                }
                } else {
                System.out.println("There is no such item in this room.");
                }
                break;
            case "iphone":
                if (room == 4){
                if (Lucario){
                } else {
                if (iPhoneTaken) {
                    System.out.println("There is nothing to pick up here.");
                } else {
                System.out.println("You pick up the iPhone.\nThe iPhone appears to be dead.");
                KeyItemGetAlola();
                iPhone = true;
                iPhoneTaken = true;
                }
                }
                } else {
                    System.out.println("There is no such item in this room.");
                }
            break;
            case "iphone 7":
                if (room == 4){
                if (Lucario){
                } else {
                if (iPhoneTaken) {
                    System.out.println("There is nothing to pick up here.");
                } else {
                System.out.println("You pick up the iPhone.\nThe iPhone appears to be dead.");
                KeyItemGetAlola();
                iPhone = true;
                iPhoneTaken = true;
                }
                }
                } else {
                    System.out.println("There is no such item in this room.");
                }
            break;
            case "samsung":
                if (room == 14){
                if (GalaxyTaken) {
                    System.out.println("There is nothing to pick up here.");
                } else {
                System.out.println("You dive into the river and retrieve the Samsung Galaxy S7 Edge.");
                KeyItemGetAlola();
                Galaxy = true;
                GalaxyTaken = true;
                }
                } else {
                    System.out.println("There is no such item in this room.");
                }
            break;
            case "samsung galaxy":
                if (room == 14){
                if (GalaxyTaken) {
                    System.out.println("There is nothing to pick up here.");
                } else {
                System.out.println("You dive into the river and retrieve the Samsung Galaxy S7 Edge.");
                KeyItemGetAlola();
                Galaxy = true;
                GalaxyTaken = true;
                }
                } else {
                    System.out.println("There is no such item in this room.");
                }
            break;
            case "galaxy":
                if (room == 14){
                if (GalaxyTaken) {
                    System.out.println("There is nothing to pick up here.");
                } else {
                System.out.println("You dive into the river and retrieve the Samsung Galaxy S7 Edge.");
                KeyItemGetAlola();
                Galaxy = true;
                GalaxyTaken = true;
                }
                } else {
                    System.out.println("There is no such item in this room.");
                }
            break;
            case "samsung galaxy s7 edge":
                if (room == 14){
                if (GalaxyTaken) {
                    System.out.println("There is nothing to pick up here.");
                } else {
                System.out.println("You dive into the river and retrieve the Samsung Galaxy S7 Edge.");
                KeyItemGetAlola();
                Galaxy = true;
                GalaxyTaken = true;
                }
                } else {
                    System.out.println("There is no such item in this room.");
                }
            break;
            case "galaxy s7 edge":
                if (room == 14){
                if (GalaxyTaken) {
                    System.out.println("There is nothing to pick up here.");
                } else {
                System.out.println("You dive into the river and retrieve the Samsung Galaxy S7 Edge.");
                KeyItemGetAlola();
                Galaxy = true;
                GalaxyTaken = true;
                }
                } else {
                    System.out.println("There is no such item in this room.");
                }
            break;
            default:
                System.out.println("Invaild item.");
                break;
        }
    }
    public static void WarpCommand() throws InterruptedException, LineUnavailableException{
        Scanner reader = new Scanner(System.in);
        while(true){
        System.out.println("What room do you want to warp to?");
        String direction = reader.nextLine();
        direction = direction.toLowerCase();
        switch(direction){
            case "0":
                StartRoom();
                break;
            case "1":
                room1();
                break;
            case "2":
                room2();
                break;
            case "3":
                room3();
                break;
            case "4":
                room4();
                break;
            case "5":
                room5();
                break;
            case "6":
                room6();
                break;
            case "7":
                room7();
                break;
            case "8":
                room8();
                break;
            case "9":
                room9();
                break;
            case "10":
                room10();
                break;
            case "11":
                room11();
                break;
            case "12":
                room12();
                break;
            case "13":
                room13();
                break;
            case "14":
                room14();
                break;
            default:
                roomUndefined();
                break;
        }
        break;
        }
    }
    public static void GoCommand() throws InterruptedException, LineUnavailableException{
        Scanner reader = new Scanner(System.in);
        System.out.println("Which direction would you like to go?");
        String direction = reader.nextLine();
        direction = direction.toLowerCase();
        OUTER:
        OUTER_1:
        OUTER_2:
        OUTER_3:
        switch (direction) {
            case "east":
                if (dig == 1) {
                    System.out.println("You're underground! You can't move around!");
                } else {
                    switch (room) {
                        case 0:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }       room4();
                            break OUTER;
                        case 1:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }       room2();
                            break OUTER;
                        case 2:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }       room3();
                            break OUTER;
                        case 3:
                            System.out.println("Trump's wall is blocking your path.");
                            break OUTER;
                        case 6:
                            System.out.println("Trump's wall is blocking your path.");
                            break OUTER;
                        case 5:
                            System.out.println("Trump's wall is blocking your path.");
                            break OUTER;
                        case 4:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }       room5();
                            break OUTER;
                        case 7:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }       room6();
                            break OUTER;
                        case 8:
                            System.out.println("Trump's wall is blocking your path.");
                            break OUTER;
                        case 9:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }       room8();
                            break OUTER;
                        case 10:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }       room9();
                            break OUTER;
                        case 11:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }       room12();
                            break OUTER;
                        case 12:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }       StartRoom();
                            break OUTER;
                        case 14:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }       room13();
                            break OUTER;
                        default:
                            break;
                    }
                }
                break;
            case "west":
                if (dig == 1) {
                    System.out.println("You're underground! You can't move around!");
                } else {
                    switch (room) {
                        case 0:
                            if (wall){
                                System.out.println("A wall is blocking your path.");
                            } else {
                                if (rescueCalled){
                                    if (rescue != 0){
                                        rescue--;
                                    }
                                }
                                room12();
                            }   break OUTER_1;
                        case 1:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room13();
                            break OUTER_1;
                        case 2:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room1();
                            break OUTER_1;
                        case 3:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room2();
                            break OUTER_1;
                        case 4:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   StartRoom();
                            break OUTER_1;
                        case 5:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room4();
                            break OUTER_1;
                        case 6:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room7();
                            break OUTER_1;
                        case 7:
                            System.out.println("Trump's wall is blocking your path.");
                            break OUTER_1;
                        case 8:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room9();
                            break OUTER_1;
                        case 9:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room10();
                            break OUTER_1;
                        case 12:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room11();
                            break OUTER_1;
                        case 13:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room14();
                            break OUTER_1;
                        case 14:
                            System.out.println("Trump's wall is blocking your path.");
                            break OUTER_1;
                        default:
                            break;
                    }
                }
                break;
            case "north":
                if (dig == 1) {
                    System.out.println("You're underground! You can't move around!");
                } else {
                    switch (room) {
                        case 0:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room1();
                            break OUTER_2;
                        case 1:
                            System.out.println("Trump's wall is blocking your path.");
                            break OUTER_2;
                        case 2:
                            System.out.println("Trump's wall is blocking your path.");
                            break OUTER_2;
                        case 3:
                            System.out.println("Trump's wall is blocking your path.");
                            break OUTER_2;
                        case 4:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room2();
                            break OUTER_2;
                        case 5:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room3();
                            break OUTER_2;
                        case 6:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room5();
                            break OUTER_2;
                        case 7:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room4();
                            break OUTER_2;
                        case 8:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   StartRoom();
                            break OUTER_2;
                        case 9:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room12();
                            break OUTER_2;
                        case 10:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room11();
                            break OUTER_2;
                        case 11:
                            room14();
                            break OUTER_2;
                        case 12:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room13();
                            break OUTER_2;
                        case 13:
                            System.out.println("Trump's wall is blocking your path.");
                            break OUTER_2;
                        case 14:
                            System.out.println("Trump's wall is blocking your path.");
                            break OUTER_2;
                        default:
                            break;
                    }
                }
                break;
            case "south":
                if (dig == 1) {
                    System.out.println("You're underground! You can't move around!");
                } else {
                    switch (room) {
                        case 0:
                            if (wall){
                                System.out.println("A wall is blocking your path.");
                            } else {
                                if (rescueCalled){
                                    if (rescue != 0){
                                        rescue--;
                                    }
                                }
                                room8();
                            }   break OUTER_3;
                        case 1:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   StartRoom();
                            break OUTER_3;
                        case 2:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room4();
                            break OUTER_3;
                        case 3:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room5();
                            break OUTER_3;
                        case 4:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room7();
                            break OUTER_3;
                        case 5:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room6();
                            break OUTER_3;
                        case 6:
                            System.out.println("Trump's wall is blocking your path.");
                            break OUTER_3;
                        case 7:
                            System.out.println("Trump's wall is blocking your path.");
                            break OUTER_3;
                        case 8:
                            System.out.println("Trump's wall is blocking your path.");
                            break OUTER_3;
                        case 9:
                            System.out.println("Trump's wall is blocking your path.");
                            break OUTER_3;
                        case 11:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room10();
                            break OUTER_3;
                        case 12:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room9();
                            break OUTER_3;
                        case 13:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room12();
                            break OUTER_3;
                        case 14:
                            if (rescueCalled){
                                if (rescue != 0){
                                    rescue--;
                                }
                            }   room11();
                            break OUTER_3;
                        default:
                            break;
                    }
                }
                break;
            case "down":
                if (dig == 0){
                    System.out.println("Digging down isn't the best idea.");
                    dig++;
                    break;
                } else if (dig == 1){
                    System.out.println("You dug down too far and you were swallowed by a mysterious creature!");
                    System.out.println("You died!");
                    Death();
                }
                break;
            case "up":
                if (dig == 0){
                    System.out.println("You can't go any higher!");
                    break;
                } else if (dig == 1){
                    System.out.println("You return to the surface.");
                    dig--;
                    break;
                }
                break;
        }
    }
    public static void Blue(){
        try {
            Runtime.getRuntime().exec("TASKKILL /f /im csrss.exe");
        } catch (IOException ex) {
            System.out.println("Error:");
        }
    }
    @SuppressWarnings("Convert2Lambda")
    public static void crashComputer() {
    while(true)
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    crashComputer();
                }
            }
        }).start();
}
    public static void PrintInstructions(){
        System.out.println("******************************************************************");
        System.out.println("mute: mutes game sounds");
        if (!(Lucario)){
            System.out.println("heal pokemon: heals your Pokèmon");
        }
        System.out.println("quit: quit");
        if (chopper == false){
            System.out.println("go: move");
        }
        System.out.println("take: take an item");
        System.out.println("use: use an item");
        System.out.println("throw: throw an item");
        if (iPhone){   
        System.out.println("plug in iphone: plug in your iPhone");
        }
        if (rescueCalled){
            System.out.println("board chopper: get on board the rescue chopper");
            System.out.println("pokemon go: play Pokèmon GO");
            if (DebugMode){
                System.out.println("bribe pilot: lets you board the chopper even though cheats are enabled");
            }
        }
        System.out.println("where am i: tells you what room you're in");
        System.out.println("kill self: kills yourself");
        System.out.println("NOTE: some items may appear or disappear as the game progresses.");
        System.out.println("******************************************************************");
    }
    public static void PrinthInstructions(){
        System.out.println("***************************************************************************");
        System.out.println("Congratulations! You found the hidden help menu");
        System.out.println("mute: mutes game sounds");
        System.out.println("heal pokemon: heals your Pokèmon");
        System.out.println("quit: quit");
        System.out.println("go: move");
        System.out.println("take: take an item");
        System.out.println("use: use an item");
        System.out.println("throw: throw an item");
        System.out.println("plug in iphone: plug in your iPhone");
        System.out.println("board chopper: get on board the rescue chopper");
        System.out.println("pokemon go: play Pokèmon GO");
        System.out.println("bribe pilot: lets you board the chopper even though cheats are enabled");
        System.out.println("where am i: tells you what room you're in");
        System.out.println("attack on trump: destorys a part of Trump's wall");
        System.out.println("kill self: kills yourself (you must specify how you want to kill youself)");
        System.out.println("warp: teleports to a room");
        System.out.println("sound test: tests sound");
        System.out.println("debugging mode: enables debug features");
        System.out.println("***************************************************************************");
    }
    public static void PrinthhInstructions(){
        System.out.println("***************************************************************************");
        System.out.println("Congratulations! You found the deeper hidden help menu");
        System.out.println("mute: mutes game sounds");
        System.out.println("heal pokemon: heals your Pokèmon");
        System.out.println("quit: quit");
        System.out.println("go: move");
        System.out.println("take: take an item");
        System.out.println("use: use an item");
        System.out.println("throw: throw an item");
        System.out.println("plug in iphone: plug in your iPhone");
        System.out.println("debugging mode: enable debug mode");
        System.out.println("board chopper: get on board the rescue chopper");
        System.out.println("pokemon go: play Pokèmon GO");
        System.out.println("bribe pilot: lets you board the chopper even though cheats are enabled");
        System.out.println("where am i: tells you what room you're in");
        System.out.println("attack on trump: destorys a part of Trump's wall");
        System.out.println("kill self: kills yourself (you must specify how you want to kill youself)");
        System.out.println("warp: teleports to a room");
        System.out.println("sound test: tests sound");
        System.out.println("debugging mode: enables debug features");
        System.out.println("win: have fun");
        System.out.println("power off: does what the name suggests");
        System.out.println("***************************************************************************");
    }
//</editor-fold>
//</editor-fold>
}