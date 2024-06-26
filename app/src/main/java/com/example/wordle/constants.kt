package com.example.wordle

object constants {
    const val user_name:String="username"
    fun getquestions():ArrayList<questions>
    {
        val questionlist= arrayListOf<questions>()
        val question1 = questions("enjoy","ramailo xa")
        val question2 = questions("april","month that exits on calander")
        val question3 = questions("Lemon","A yellow citrus fruit with an acidic flavor.")
        val question4 = questions("Bliss ","Extreme happiness or joy.")
        val question5 = questions("Candy"," Sweet food made with sugar or syrup, often flavored and colored.")
        val question6 = questions("Bloom","The flower or blossom of a plant; to flourish or thrive.")
        val question7 = questions("Giant","A very large or powerful person, animal, or thing.")
        val question8 = questions("Happy","Feeling or showing pleasure or contentment.")
        val question9 = questions("Storm","A violent disturbance of the atmosphere, with strong winds, rain, thunder, and lightning.")
        val question10 = questions("sweet","Having a pleasant taste, often sugary or flavorful.")
        val question11 = questions("Fleet", "A group of ships sailing together, or moving swiftly.")
        val question12 = questions("Forge", "To create or shape something, typically by heating and hammering metal.")
        val question13 = questions("Ample", "Plentiful or abundant in quantity or size.")
        val question14 = questions("Gleam", "A faint or brief light, often shining or reflecting.")
        val question15 = questions("Oasis", "A fertile area in a desert, typically with water and vegetation.")
        val question16 = questions("Rivet", "A metal pin or bolt used to fasten pieces of metal together.")
        val question17 = questions("Quirk", "A peculiar aspect or characteristic.")
        val question18 = questions("Joust", "A combat between two mounted knights using lances.")
        val question19 = questions("Zesty", "Full of flavor or zest; lively or spirited.")
        val question20 = questions("Witty", "Clever and amusing in manner or expression.")
        val question21 = questions("Blink", "To shut and open the eyes quickly.")
        val question22 = questions("Blast", "A destructive wave of highly compressed air spreading outward from an explosion.")
        val question23 = questions("Braid", "To interweave three or more strands of something together.")
        val question24 = questions("Crave", "To have a strong desire for something.")
        val question25 = questions("Curse", "A solemn utterance intended to invoke a supernatural power to inflict harm or punishment on someone or something.")
        val question26 = questions("Drift", "To be carried along by currents of air or water.")
        val question27 = questions("Dwarf", "A person or creature much smaller than average, especially because of a medical condition or genetic mutation.")
        val question28 = questions("Faint", "To lose consciousness for a short time; lacking in strength or clarity.")
        val question29 = questions("Flame", "The visible, gaseous part of a fire; to burn brightly.")
        val question30 = questions("Forge", "To create or shape something, typically by heating and hammering metal.")
        val question31 = questions("Greed", "Intense and selfish desire for something, especially wealth, power, or food.")
        val question32 = questions("Grill", "To cook food over a grid of metal bars.")
        val question33 = questions("Harsh", "Rough or unpleasant to the senses.")
        val question34 = questions("ANGER", "a strong feeling of annoyance, displeasure, or hostility.")
        val question35 = questions("Ivory", "A hard, creamy-white substance composing the tusks of certain animals, especially elephants.")
        val question36 = questions("Joker", "A person who is fond of joking.")
        val question37 = questions("Lodge", "A small house at the gates of a park or in the grounds of a large house.")
        val question38 = questions("Mirth", "Amusement, especially as expressed in laughter.")
        val question39 = questions("Misty", "Full of, covered with, or accompanied by mist.")
        val question40 = questions("Novel", "A fictitious prose narrative of book length, typically representing character and action with some degree of realism.")
        val question41 = questions("Odour", "A distinctive smell, especially an unpleasant one.")
        val question42 = questions("Peace", "Freedom from disturbance; tranquility or calmness.")
        val question43 = questions("Petal", "Each of the segments of the corolla of a flower, which are modified leaves and are typically colored.")
        val question44 = questions("Quake", "A shaking or trembling movement, typically caused by a sudden release of energy.")
        val question45 = questions("Quote", "A repetition of someone else's statement or thoughts.")
        val question46 = questions("Ridge", "A long, narrow hilltop, mountain range, or watershed.")
        val question47 = questions("Scent", "A distinctive smell, especially one that is pleasant.")
        val question48 = questions("Shard", "A piece of broken ceramic, metal, glass, or rock, typically having sharp edges.")
        val question49 = questions("Sleek", "Smooth and glossy.")
        val question50 = questions("Smirk", "A smile that expresses smugness or scorn instead of pleasure.")
        val question51 = questions("Toast", "Sliced bread browned on both sides by exposure to heat.")
        val question52 = questions("Trace", "A mark, object, or other indication of the existence or passing of something.")
        val question53 = questions("Unity", "The state of being united or joined as a whole.")
        val question54 = questions("Vocal", "Relating to the human voice or speech.")
        val question55 = questions("Witty", "Clever and amusing in manner or expression.")
        val question56 = questions("Yield", "To produce or provide a natural, agricultural, or industrial product.")
        val question57 = questions("Pulse", "The rhythmic throbbing of arteries produced by the regular contractions of the heart.")
        val question58 = questions("Abode", "A place of residence; a house or home.")
        val question59 = questions("Aloof", "Not friendly or forthcoming; cool and distant.")
        val question60 = questions("Pilot", "a person who operates the flying controls of an aircraft.")
        val question61 = questions("Batty", "Slightly crazy; foolish or eccentric.")
        val question62 = questions("Dream", " A series of thoughts, images, or emotions occurring during sleep; to envision or imagine.")
        val question63 = questions("Couch", "A long upholstered piece of furniture for several people to sit on.")
        val question64 = questions("Craft", "An activity involving skill in making things by hand.")
        val question65 = questions("Drape", "To arrange cloth gracefully in loose folds.")
        val question66 = questions("Eager", "Having or showing keen interest or enthusiasm.")
        val question67 = questions("Elude", "To evade or escape from a danger, enemy, or pursuer, typically in a skillful or cunning way.")
        val question68 = questions("Flaky", "Easily broken or crumbling.")
        val question69 = questions("Frost", "A deposit of small white ice crystals formed on the ground or other surfaces when the temperature falls below freezing.")
        val question70 = questions("Glory", "High renown or honor won by notable achievements.")
        val question71 = questions("Haste", "Excessive speed or urgency of movement or action.")
        val question72 = questions("Start", "begin or be reckoned from a particular point in time or space.")
        val question73 = questions("Knack", "An acquired or natural skill at doing something.")
        val question74 = questions("Train", "teach (a person or animal) a particular skill or type of behaviour through practice and instruction over a period of time.")
        val question75 = questions("Munch", "To chew steadily or vigorously, often with a crunching sound.")
        val question76 = questions("Mural", "A painting or other work of art executed directly on a wall.")
        val question77 = questions("River", "a large natural stream of water flowing in a channel to the sea, a lake")
        val question78 = questions("Pouch", "A small bag or other flexible receptacle.")
        val question79 = questions("Quash", "To reject or void, especially by legal procedure.")
        val question80 = questions("Rigid", "Unable to bend or be forced out of shape; not flexible.")
        val question81 = questions("Grass", "vegetation consisting of typically short plants with long, narrow leaves, growing wild")
        val question82 = questions("Magic", "the power of apparently influencing events by using mysterious or supernatural forces.")
        val question83 = questions("Tonic", "A medicinal substance taken to give a feeling of vigor or well-being.")
        val question84 = questions("Urges", "A strong desire or impulse.")
        val question85 = questions("Music", "the written or printed signs representing vocal or instrumental sound.")
        val question86 = questions("Trust", "firm belief in the reliability, truth, or ability of someone or something")
        val question87 = questions("Chase", "pursue in order to catch or catch up with.")
        val question88 = questions("Cycle", "a series of events that are regularly repeated in the same order.")
        val question89 = questions("Cheap", "low in price, especially in relation to similar items or services.")
        val question90 = questions("Xerox", "To make a copy of a document using a photocopier.")
        val question91 = questions("Photo", "a combining form meaning “light” ( photobiology ); also used to represent “photographic” or “photograph” in the formation of compound words:.")
        val question92 = questions("Chair", "a seat typically having four legs and a back for one person")
        val question93 = questions("Abide", "To accept or act in accordance with a rule, decision, or recommendation.")
        val question94 = questions("admit", "confess to be true or to be the case.")
        val question95 = questions("Dress", "put on one's clothes.")
        val question96 = questions("Array", "Collection of similar data types,mainly used in programming")
        val question97 = questions("Basin", "A wide, round open container, especially one used for holding liquid.")
        val question98 = questions("Input", "what is put in, taken in, or operated on by any process or system.")
        val question99 = questions("Drift", "To be carried along by currents of air or water.")
        val question100 = questions("Clash", "A violent confrontation or struggle.")
        val question101 = questions("Craft", "An activity involving skill in making things by hand.")
        val question102 = questions("White", "maybe a light color")
        val question103 = questions("Lunch", "a usually light meal")
        val question104 = questions("Print", "produce (books, newspapers, etc.), especially in large quantities, by a mechanical process involving the transfer of text or designs to paper.")
        val question105 = questions("Taste", "the sensation of flavour perceived in the mouth and throat on contact with a substance.")
        val question106 = questions("Frost", "A deposit of small white ice crystals formed on the ground or other surfaces when the temperature falls below freezing.")
        val question107 = questions("Glory", "High renown or honor won by notable achievements.")
        val question108 = questions("Board", "Teacher writes with chalk or marker")
        val question109 = questions("Jolly", "Full of high spirits and good humor.")
        val question110 = questions("Trial", "a formal examination of evidence by a judge, typically before a jury, in order to decide guilt in a case of criminal or civil proceedings.")
        val question111 = questions("Alone", "having no one else present.")
        val question112 = questions("China", "Neighbouring country of Nepal")
        val question113 = questions("Treat", "behave towards or deal with in a certain way.")
        val question114 = questions("Notch", "A indentation or incision on an edge or surface.")
        val question115 = questions("Avoid", "keep away from or stop oneself from doing something")
        val question116 = questions("Angle", "a figure which is formed by two rays or lines that shares a common endpoint")
        val question117 = questions("Apply", "make a formal application or request.")
        val question118 = questions("Scarf", "A length or square of fabric worn around the neck or head.")
        val question119 = questions("First", "coming before all others in time or order; earliest; ")
        val question120 = questions("Quiet", "making little or no noise.")
        val question121 = questions("Sorry", "feeling sad or distressed through sympathy with someone else's misfortune.")
        val question122 = questions("Vault", "A large room or chamber used for storage, especially an underground one.")
        val question123 = questions("Sugar", "a sweet crystalline substance obtained from various plants, especially sugar cane")
        val question124 = questions("Wedge", "A piece of wood, metal, or some other material having one thick end and tapering to a thin edge.")
        val question125 = questions("Whisk", "To beat or stir (a substance, especially cream or eggs) with a light, rapid movement.")
        val question126 = questions("Wrink", "A small fold, crease, or irregularity in an otherwise smooth surface.")
        val question127 = questions("Hatch", "To emerge from or cause to emerge from an egg.")
        val question128 = questions("Yearn", "To have an intense feeling of longing for something.")
        val question129 = questions("Zebra", "An African wild horse with black-and-white stripes and an erect mane.")
        val question130 = questions("Agree", "have the same opinion about something; concur.")
        val question131 = questions("Admin", "A person responsible for carrying out administrative work, typically in an office.")
        val question132 = questions("Floor", "the lower surface of a room, on which one may walk.")
        val question133 = questions("virus", "a piece of code that is capable of copying itself and typically has a detrimental effect,")
        val question134 = questions("Daily", "done, produced, or occurring every day or every weekday.")
        val question135 = questions("Bluff", "An attempt to deceive someone into believing that one can or will do something.")
        val question136 = questions("Pluck", "To pull something quickly and sharply, especially to remove it.")
        val question137 = questions("Minus", "with the subtraction of")
        val question138 = questions("Dense", "Closely compacted in substance; thick.")
        val question139 = questions("Earth", "The planet on which we live; the soil or land.")
        val question140 = questions("Faith", "Complete trust or confidence in someone or something.")
        val question141 = questions("Ghost", "The spirit of a dead person, especially one believed to appear in bodily likeness to living persons or to haunt specific locations.")
        val question142 = questions("Blake", "ts meaning in British also extends to “fair-haired” or “dark")
        val question143 = questions("Inert", "Lacking the ability or strength to move.")
        val question144 = questions("Jelly", "A sweet, clear, semisolid, somewhat elastic spread or preserve made from fruit juice and sugar boiled to a thick consistency.")
        val question145 = questions("Knife", "An instrument composed of a blade fixed into a handle, used for cutting or as a weapon.")
        val question146 = questions("Logic", "Reasoning conducted or assessed according to strict principles of validity.")
        val question147 = questions("Moral", "Concerned with the principles of right and wrong behavior and the goodness or badness of human character.")
        val question148 = questions("Noble", "Belonging to a hereditary class with high social or political status; aristocratic.")
        val question149 = questions("Oasis", "A fertile area in a desert, typically with water and vegetation.")
        val question150 = questions("Paint", "A colored substance that is spread over a surface and dries to leave a thin decorative or protective coating.")
        val question151 = questions("Quick", "Moving fast or doing something in a short time.")
        val question152 = questions("clock", "a mechanical or electrical device for measuring time, indicating hours, minutes")
        val question153 = questions("babes","an affectionate form of address, typically for someone with whom one has a sexual or romantic relationship.")
        val question165 = questions("xenon", "the chemical element of atomic number 54, a member of the noble gas series.")
        val question154 = questions("igloo", "house built with snow or ice")
        val question155 = questions("gyani", "respect, consideration, and kindness towards others,Sanskar has that quality lol")
        val question156 = questions("habit", "an acquired behavior pattern regularly followed until it has become almost involuntary")
        val question157 = questions("jelly", "a food preparation of a soft, elastic consistency due to the presence of gelatin, pectin, etc")
        val question158 = questions("cabin", "a small house or cottage, usually of simple design and construction:")
        val question159 = questions("daisy", "Sunshine, daisies, butter mellow, turn this stupid, fat rat yellow")
        val question160 = questions("early", "happening or done before the usual or expected time.")
        val question161 = questions("grape", "a berry (typically green, purple, or black) growing in clusters on a grapevine, eaten as fruit and used in making wine.")
        val question162 = questions("idiot", "a stupid person.")
        val question163 = questions("maple", " tree or shrub with lobed leaves, winged fruits, and colourful autumn foliage, grown as an ornamental")
        val question164 = questions("sanji", "older japanese name given in the anime series One piece")
        val question166 = questions("lucky","having, bringing, or resulting from good luck.")
        val question167 = questions("venus","planet in our solar system")
        val question168 = questions("drink","need more energy drink")
        val question169 =questions("dairy","a building or room for the processing, storage, and distribution of milk and milk products.")
        val question170 =questions("lover","it's a music lyrics is,Can we always be this close forever and ever? And ah, take me out, and take me home (forever and ever) You're my, my, my, my Lover")
        questionlist.add(question1)
        questionlist.add(question2)
        questionlist.add(question3)
        questionlist.add(question4)
        questionlist.add(question5)
        questionlist.add(question6)
        questionlist.add(question7)
        questionlist.add(question8)
        questionlist.add(question9)
        questionlist.add(question10)
        questionlist.add(question11)
        questionlist.add(question12)
        questionlist.add(question13)
        questionlist.add(question14)
        questionlist.add(question15)
        questionlist.add(question16)
        questionlist.add(question17)
        questionlist.add(question18)
        questionlist.add(question19)
        questionlist.add(question20)
        questionlist.add(question21)
        questionlist.add(question22)
        questionlist.add(question23)
        questionlist.add(question24)
        questionlist.add(question25)
        questionlist.add(question26)
        questionlist.add(question27)
        questionlist.add(question28)
        questionlist.add(question29)
        questionlist.add(question30)
        questionlist.add(question31)
        questionlist.add(question32)
        questionlist.add(question33)
        questionlist.add(question34)
        questionlist.add(question35)
        questionlist.add(question36)
        questionlist.add(question37)
        questionlist.add(question38)
        questionlist.add(question39)
        questionlist.add(question40)
        questionlist.add(question41)
        questionlist.add(question42)
        questionlist.add(question43)
        questionlist.add(question44)
        questionlist.add(question45)
        questionlist.add(question46)
        questionlist.add(question47)
        questionlist.add(question48)
        questionlist.add(question49)
        questionlist.add(question50)
        questionlist.add(question51)
        questionlist.add(question52)
        questionlist.add(question53)
        questionlist.add(question54)
        questionlist.add(question55)
        questionlist.add(question56)
        questionlist.add(question57)
        questionlist.add(question58)
        questionlist.add(question59)
        questionlist.add(question60)
        questionlist.add(question61)
        questionlist.add(question62)
        questionlist.add(question63)
        questionlist.add(question64)
        questionlist.add(question65)
        questionlist.add(question66)
        questionlist.add(question67)
        questionlist.add(question68)
        questionlist.add(question69)
        questionlist.add(question70)
        questionlist.add(question71)
        questionlist.add(question72)
        questionlist.add(question73)
        questionlist.add(question74)
        questionlist.add(question75)
        questionlist.add(question76)
        questionlist.add(question77)
        questionlist.add(question78)
        questionlist.add(question79)
        questionlist.add(question80)
        questionlist.add(question81)
        questionlist.add(question82)
        questionlist.add(question83)
        questionlist.add(question84)
        questionlist.add(question85)
        questionlist.add(question86)
        questionlist.add(question87)
        questionlist.add(question88)
        questionlist.add(question89)
        questionlist.add(question90)
        questionlist.add(question91)
        questionlist.add(question92)
        questionlist.add(question93)
        questionlist.add(question94)
        questionlist.add(question95)
        questionlist.add(question96)
        questionlist.add(question97)
        questionlist.add(question98)
        questionlist.add(question99)
        questionlist.add(question100)
        questionlist.add(question101)
        questionlist.add(question102)
        questionlist.add(question103)
        questionlist.add(question104)
        questionlist.add(question105)
        questionlist.add(question106)
        questionlist.add(question107)
        questionlist.add(question108)
        questionlist.add(question109)
        questionlist.add(question110)
        questionlist.add(question111)
        questionlist.add(question112)
        questionlist.add(question113)
        questionlist.add(question114)
        questionlist.add(question115)
        questionlist.add(question116)
        questionlist.add(question117)
        questionlist.add(question118)
        questionlist.add(question119)
        questionlist.add(question120)
        questionlist.add(question121)
        questionlist.add(question122)
        questionlist.add(question123)
        questionlist.add(question124)
        questionlist.add(question125)
        questionlist.add(question126)
        questionlist.add(question127)
        questionlist.add(question128)
        questionlist.add(question129)
        questionlist.add(question130)
        questionlist.add(question131)
        questionlist.add(question132)
        questionlist.add(question133)
        questionlist.add(question134)
        questionlist.add(question135)
        questionlist.add(question136)
        questionlist.add(question137)
        questionlist.add(question138)
        questionlist.add(question139)
        questionlist.add(question140)
        questionlist.add(question141)
        questionlist.add(question142)
        questionlist.add(question143)
        questionlist.add(question144)
        questionlist.add(question145)
        questionlist.add(question146)
        questionlist.add(question147)
        questionlist.add(question148)
        questionlist.add(question149)
        questionlist.add(question150)
        questionlist.add(question151)
        questionlist.add(question152)
        questionlist.add(question153)
        questionlist.add(question154)
        questionlist.add(question156)
        questionlist.add(question155)
        questionlist.add(question157)
        questionlist.add(question158)
        questionlist.add(question159)
        questionlist.add(question160)
        questionlist.add(question162)
        questionlist.add(question162)
        questionlist.add(question163)
        questionlist.add(question164)
        questionlist.add(question165)
        questionlist.add(question166)
        questionlist.add(question167)
        questionlist.add(question168)
        questionlist.add(question169)
        questionlist.add(question170)







        questionlist.shuffle()
        return questionlist
    }
}