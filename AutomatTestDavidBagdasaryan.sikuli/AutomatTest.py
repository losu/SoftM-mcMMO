#opening a application
doubleClick("1417369465410.png")
sleep(15);
type("losu");
type(Key.ENTER);
click("1417369550946.png");

sleep(15);
click("1417369583808.png");
sleep(5);
doubleClick("1417369603168.png");


#find("1417362499474.png");
#click("1417362512286.png");
sleep(5);

#Showing the quest list
type("/");
sleep(2);
type("quest");
sleep(2);
type(Key.ENTER);
sleep(2);

#Taking a quest and showing that it is taken
type("/");
sleep(2);
type("quest 0");
sleep(2);
type(Key.ENTER);
sleep(2);
type("/");
type("quest");
sleep(1);
type(Key.ENTER);
sleep(2);

#Completing the quest
type("/");
sleep(0.5);
type("gamemode 1");
sleep(0.5);
type(Key.ENTER);
sleep(1);
type("/give losu dirt 12");
sleep(0.1);
type(Key.ENTER);
sleep(1);
type("/");
sleep(0.5);
type("gamemode 0");
sleep(0.5);
type(Key.ENTER);
sleep(1);
type("/quest 0");
sleep(0.5);
type(Key.ENTER);
sleep(2);
#Checking if player can take again the complited quest
type("quest 0");
sleep(5);


