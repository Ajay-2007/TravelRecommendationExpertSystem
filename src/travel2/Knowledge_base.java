package travel2;

public class Knowledge_base {

	String data1 = "(assert\n" + 
			"(data ( name_of_place \"Praia Mole\")(country \"Brazil\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Darjeeling and Gangtok\")(country \"India\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Da Lat\")(country \"Vietnam\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Zurich\")(country \"Europe\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Volubilis\")(country \"Morocco\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"The Great Wall of China\")(country \"China\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Colosseum and Forum\")(country \"Italy\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Tikal\")(country \"Guatemala\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Praia Mole\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Darjeeling and Gangtok\")(country \"India\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Da Lat\")(country \"Vietnam\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Zurich\")(country \"Europe\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Volubilis\")(country \"Morocco\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"The Great Wall of China\")(country \"China\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"The Colosseum and Forum\")(country \"Italy\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Tikal\")(country \"Guatemala\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Praia Mole\")(country \"Brazil\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Darjeeling and Gangtok\")(country \"India\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Da Lat\")(country \"Vietnam\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Zurich\")(country \"Europe\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Volubilis\")(country \"Morocco\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"The Great Wall of China\")(country \"China\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"The Colosseum and Forum\")(country \"Italy\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Tikal\")(country \"Guatemala\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Praia Mole\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Darjeeling and Gangtok\")(country \"India\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Da Lat\")(country \"Vietnam\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Zurich\")(country \"Europe\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Volubilis\")(country \"Morocco\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"The Great Wall of China\")(country \"China\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"The Colosseum and Forum\")(country \"Italy\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Tikal\")(country \"Guatemala\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Praia Mole\")(country \"Brazil\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Darjeeling and Gangtok\")(country \"India\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Da Lat\")(country \"Vietnam\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Zurich\")(country \"Europe\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Volubilis\")(country \"Morocco\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"The Great Wall of China\")(country \"China\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"The Colosseum and Forum\")(country \"Italy\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Tikal\")(country \"Guatemala\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Praia Mole\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Darjeeling and Gangtok\")(country \"India\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Da Lat\")(country \"Vietnam\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Zurich\")(country \"Europe\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Volubilis\")(country \"Morocco\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"The Great Wall of China\")(country \"China\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"The Colosseum and Forum\")(country \"Italy\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Tikal\")(country \"Guatemala\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Praia Mole\")(country \"Brazil\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Darjeeling and Gangtok\")(country \"India\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Da Lat\")(country \"Vietnam\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			")"; 
	
	String data2 = "(assert\n" + 
			"(data ( name_of_place \"Machu Picchu\")(country \"Peru\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Tikal\")(country \"Guatemala\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Stonehenge\")(country \"England\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"The Colosseum and Forum\")(country \"Italy\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"The Great Wall of China\")(country \"China\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Volubilis\")(country \"Morocco\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Zurich\")(country \"Europe\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Da Lat\")(country \"Vietnam\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Darjeeling and Gangtok\")(country \"India\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Praia Mole\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Waipio Valley Beach\")(country \"HI\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Matira Beach\")(country \"French Polynesia\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Long Beach\")(country \"Thailand\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Puka Beach\")(country \"Philippines\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Horseshoe Bay\")(country \"Bermuda\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Machu Picchu\")(country \"Peru\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Tikal\")(country \"Guatemala\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Stonehenge\")(country \"England\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"The Colosseum and Forum\")(country \"Italy\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"The Great Wall of China\")(country \"China\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Volubilis\")(country \"Morocco\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Zurich\")(country \"Europe\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Da Lat\")(country \"Vietnam\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Darjeeling and Gangtok\")(country \"India\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Praia Mole\")(country \"Brazil\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Waipio Valley Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Matira Beach\")(country \"French Polynesia\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Long Beach\")(country \"Thailand\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Puka Beach\")(country \"Philippines\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Horseshoe Bay\")(country \"Bermuda\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Machu Picchu\")(country \"Peru\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Tikal\")(country \"Guatemala\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Stonehenge\")(country \"England\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"The Colosseum and Forum\")(country \"Italy\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"The Great Wall of China\")(country \"China\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Volubilis\")(country \"Morocco\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Zurich\")(country \"Europe\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Da Lat\")(country \"Vietnam\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Darjeeling and Gangtok\")(country \"India\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Praia Mole\")(country \"Brazil\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Waipio Valley Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Matira Beach\")(country \"French Polynesia\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Long Beach\")(country \"Thailand\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Puka Beach\")(country \"Philippines\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Horseshoe Bay\")(country \"Bermuda\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Machu Picchu\")(country \"Peru\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Tikal\")(country \"Guatemala\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Stonehenge\")(country \"England\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Colosseum and Forum\")(country \"Italy\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"The Great Wall of China\")(country \"China\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Volubilis\")(country \"Morocco\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Zurich\")(country \"Europe\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Da Lat\")(country \"Vietnam\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Darjeeling and Gangtok\")(country \"India\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Praia Mole\")(country \"Brazil\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Waipio Valley Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Matira Beach\")(country \"French Polynesia\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Long Beach\")(country \"Thailand\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Puka Beach\")(country \"Philippines\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Horseshoe Bay\")(country \"Bermuda\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Machu Picchu\")(country \"Peru\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Tikal\")(country \"Guatemala\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Stonehenge\")(country \"England\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Colosseum and Forum\")(country \"Italy\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"The Great Wall of China\")(country \"China\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Volubilis\")(country \"Morocco\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Zurich\")(country \"Europe\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Da Lat\")(country \"Vietnam\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Darjeeling and Gangtok\")(country \"India\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Praia Mole\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Waipio Valley Beach\")(country \"HI\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Matira Beach\")(country \"French Polynesia\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Long Beach\")(country \"Thailand\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Puka Beach\")(country \"Philippines\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Horseshoe Bay\")(country \"Bermuda\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Machu Picchu\")(country \"Peru\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Tikal\")(country \"Guatemala\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Stonehenge\")(country \"England\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"The Colosseum and Forum\")(country \"Italy\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"The Great Wall of China\")(country \"China\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Volubilis\")(country \"Morocco\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Zurich\")(country \"Europe\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Da Lat\")(country \"Vietnam\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Darjeeling and Gangtok\")(country \"India\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			")";
	String data3 = "(assert\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Spring\")(type_of_place \"Historic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"The Colosseum and Forum\")(country \"Italy\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Autumn\")(type_of_place \"Historic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Winter\")(type_of_place \"Historic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Machu Picchu\")(country \"Peru\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Tikal\")(country \"Guatemala\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Spring\")(type_of_place \"Monuments\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Tikal\")(country \"Guatemala\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Autumn\")(type_of_place \"Monuments\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Winter\")(type_of_place \"Monuments\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Spring\")(type_of_place \"Ancient Temples\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Machu Picchu\")(country \"Peru\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Ancient Temples\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Machu Picchu\")(country \"Peru\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Winter\")(type_of_place \"Ancient Temples\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Volubilis\")(country \"Morocco\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Spring\")(type_of_place \"Beaches\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Beaches\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Winter\")(type_of_place \"Beaches\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Tikal\")(country \"Guatemala\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Spring\")(type_of_place \"Tropical Island Resort\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Da Lat\")(country \"Vietnam\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"The Great Wall of China\")(country \"China\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Da Lat\")(country \"Vietnam\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Autumn\")(type_of_place \"Tropical Island Resort\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Alaska\")(country \"USA\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Winter\")(type_of_place \"Tropical Island Resort\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Spring\")(type_of_place \"Theme Parks\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Autumn\")(type_of_place \"Theme Parks\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Winter\")(type_of_place \"Theme Parks\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Spring\")(type_of_place \"Zoos and Aquaria\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Autumn\")(type_of_place \"Zoos and Aquaria\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Da Lat\")(country \"Vietnam\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Winter\")(type_of_place \"Zoos and Aquaria\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Volubilis\")(country \"Morocco\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Volubilis\")(country \"Morocco\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Tikal\")(country \"Guatemala\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Cooktown\")(country \"Australia\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Spring\")(type_of_place \"Botanical Gardens\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Geneva\")(country \"Europe\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"The Colosseum and Forum\")(country \"Italy\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Botanical Gardens\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Cape Town\")(country \"Africa\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Thar Desert\")(country \"India\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"The Great Wall of China\")(country \"China\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"The Pyramids at Giza\")(country \"Egypt\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Sunset Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Winter\")(type_of_place \"Botanical Gardens\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Angkor Wat\")(country \"Cambodia\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Shimla\")(country \"India\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Blue Beach\")(country \"Puerto Rico\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Great Wall of China\")(country \"China\")(season \"Spring\")(type_of_place \"Carnivals\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Machu Picchu\")(country \"Peru\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"The Colosseum and Forum\")(country \"Italy\")(season \"Autumn\")(type_of_place \"Carnivals\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Pyin U Lwin\")(country \"Burma\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Wahiba sands\")(country \"Oman\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Easter Island\")(country \"Chile\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Arabian Desert\")(country \"UAE\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Duba\")(country \"Africa\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Winter\")(type_of_place \"Carnivals\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 1000)(closing_budget 5000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Zurich\")(country \"Europe\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Chichén Itzá\")(country \"Mexico\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 20000)(closing_budget 50000))\n" + 
			"(data ( name_of_place \"Zurich\")(country \"Europe\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Taj Mahal\")(country \"India\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Gorillas\")(country \"Rwanda\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"The Parthenon\")(country \"Greece\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Pansy Island\")(country \"Mozambique\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Honokalani Beach\")(country \"HI\")(season \"Spring\")(type_of_place \"Romantic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Mount Mogan\")(country \"China\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"The Alhambra\")(country \"California\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Zurich\")(country \"Europe\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Aspen\")(country \"USA\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Bandarban\")(country \"Banladesh\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Arizona\")(country \"USA\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 70000)(closing_budget 90000))\n" + 
			"(data ( name_of_place \"Victoria Peak\")(country \"Hong Kong\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Northern Kenya\")(country \"Kenya\")(season \"Autumn\")(type_of_place \"Romantic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Sukhothai\")(country \"Thailand\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 5000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"El Nido\")(country \"Philippines\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 10000)(closing_budget 15000))\n" + 
			"(data ( name_of_place \"Maasai Mara\")(country \"Kenya\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Sahara Desert\")(country \"Egypt\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 15000)(closing_budget 30000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Ipanema Beach\")(country \"Brazil\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 30000)(closing_budget 60000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"Anse Lazio\")(country \"Seychelles\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 50000)(closing_budget 70000))\n" + 
			"(data ( name_of_place \"The Central Kalahari Game Reserve\")(country \"Africa\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 60000)(closing_budget 80000))\n" + 
			"(data ( name_of_place \"Black Rock Desert\")(country \"USA\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Ruaha National Park\")(country \"Tanzania\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 80000)(closing_budget 100000))\n" + 
			"(data ( name_of_place \"Ooty\")(country \"India\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			"(data ( name_of_place \"Honopu Beach\")(country \"HI\")(season \"Winter\")(type_of_place \"Romantic\")(starting_budget 90000)(closing_budget 10000))\n" + 
			")";
	
}
