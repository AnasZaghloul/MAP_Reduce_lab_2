# MAP_Reduce_lab_2

TP_MAP_reduce_lab2

Author : Anas Zaghloul, Abdelhadi Hirchi

# Lien vers notre git :

Lien GIT : https://github.com/AnasZaghloul/MAP_Reduce_lab_2.git


# MapReduce JAVA_lab_2

# 1.6.1

[anas.zaghloul@hadoop-edge01 ~]$ kinit
Password for anas.zaghloul@EFREI.ONLINE:
[anas.zaghloul@hadoop-edge01 ~]$ ls
]           bigdata  local.txt  pg66454.txt    reducer     secret-of-the-universe  trees.csv
answer.txt  hi.txt   mapper.py  pg66454.txt.1  reducer.py  sudoku.dta
hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar
Frankenstein.txt  Joyce.txt

# 1.6.3

[anas.zaghloul@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar wordcount Frankenstein.txt user/anas.zaghloul

[anas.zaghloul@hadoop-edge01 ~]$ hdfs dfs -cat user/anas.zaghloul/part-r-00000
"Defects,"      1
"Information    1
"Plain  2
"Project        5
"Right  1
#84]    1
$5,000) 1
'AS-IS',        1
("the   1
($1     1
(801)   1
(Godwin)        3
(I      3
(July   1
(May    1
(a)     1
(although       2
(and    1
(any    1
(as     1
(b)     1
(c)     1
(does   1
(foolish        1
(for    2
(if     1
(inexperience   1
(or     3
(sight  1
(so     1
(trademark/copyright)   1
(wretched       1
(www.gutenberg.org),    1
*       4
***     4

...

# 1.8.1  Districts containing trees (very easy)


[anas.zaghloul@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar Districts tree/tree.csv user/anas.zaghloul/181

[anas.zaghloul@hadoop-edge01 ~]$ hdfs dfs -cat user/anas.zaghloul/181/part-r-00000
3       1
4       1
5       2
6       1
7       2
8       5
9       1
11      1
12      29
13      2
14      3
15      1
16      36
17      1
18      1
19      6
20      3


# 1.8.2 Show all existing species (very easy)

[anas.zaghloul@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar treeSpecies  tree/tree.csv user/anas.zaghloul/182

[anas.zaghloul@hadoop-edge01 ~]$ hdfs dfs -cat user/anas.zaghloul/182/part-r-00000
araucana
atlantica
australis
baccata
bignonioides
biloba
bungeana
cappadocicum
carpinifolia
colurna
coulteri
decurrens
dioicus
distichum
excelsior
fraxinifolia
giganteum
giraldii
glutinosa
grandiflora
hippocastanum
ilex
involucrata
japonicum
kaki
libanii
monspessulanum
nigra
nigra laricio
opalus
orientalis
papyrifera
petraea
pseudoacacia
sempervirens
serrata
stenoptera
suber
sylvatica
tomentosa
tulipifera
ulmoides
virginiana
x acerifolia


# 1.8.3 Number of trees by kinds (easy)

[anas.zaghloul@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar treeSpeciesCount  tree/tree.csv user/anas.zaghloul/183

[anas.zaghloul@hadoop-edge01 ~]$ hdfs dfs -cat user/anas.zaghloul/183/part-r-00000
araucana        1
atlantica       2
australis       1
baccata 2
bignonioides    1
biloba  5
bungeana        1
cappadocicum    1
carpinifolia    4
colurna 3
coulteri        1
decurrens       1
dioicus 1
distichum       3
excelsior       1
fraxinifolia    2
giganteum       5
giraldii        1
glutinosa       1
grandiflora     1
hippocastanum   3
ilex    1
involucrata     1
japonicum       1
kaki    2
libanii 2
monspessulanum  1
nigra   3
nigra laricio   1
opalus  1
orientalis      8
papyrifera      1
petraea 2
pseudoacacia    1
sempervirens    1
serrata 1
stenoptera      1
suber   1
sylvatica       8
tomentosa       2
tulipifera      2
ulmoides        1
virginiana      2
x acerifolia    11


# 1.8.4 Maximum height per kind of tree using the average

[anas.zaghloul@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar maxHeightSpecies  tree/tree.csv user/anas.zaghloul/184

[anas.zaghloul@hadoop-edge01 ~]$ hdfs dfs -cat user/anas.zaghloul/184/part-r-00000
araucana        9.0
atlantica       25.0
australis       16.0
baccata 13.0
bignonioides    15.0
biloba  33.0
bungeana        10.0
cappadocicum    16.0
carpinifolia    30.0
colurna 20.0
coulteri        14.0
decurrens       20.0
dioicus 10.0
distichum       35.0
excelsior       30.0
fraxinifolia    27.0
giganteum       35.0
giraldii        35.0
glutinosa       16.0
grandiflora     12.0
hippocastanum   30.0
ilex    15.0
involucrata     12.0
japonicum       10.0
kaki    14.0
libanii 30.0
monspessulanum  12.0
nigra   30.0
nigra laricio   30.0
opalus  15.0
orientalis      34.0
papyrifera      12.0
petraea 31.0
pseudoacacia    11.0
sempervirens    30.0
serrata 18.0
stenoptera      30.0
suber   10.0
sylvatica       30.0
tomentosa       20.0
tulipifera      35.0
ulmoides        12.0
virginiana      14.0
x acerifolia    45.0


# 1.8.5 Sort the trees height from smallest to largest : using average

[anas.zaghloul@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar treesSortedByHeight  tree/tree.csv user/anas.zaghloul/185

[anas.zaghloul@hadoop-edge01 ~]$ hdfs dfs -cat user/anas.zaghloul/185/part-r-00000
3 - Fagus sylvatica (Fagaceae)  2.0
89 - Taxus baccata (Taxaceae)   5.0
62 - Cedrus atlantica (Pinaceae)        6.0
39 - Araucaria araucana (Araucariaceae) 9.0
44 - Styphnolobium japonicum (Fabaceae) 10.0
32 - Quercus suber (Fagaceae)   10.0
95 - Pinus bungeana (Pinaceae)  10.0
61 - Gymnocladus dioicus (Fabaceae)     10.0
63 - Fagus sylvatica (Fagaceae) 10.0
4 - Robinia pseudoacacia (Fabaceae)     11.0
93 - Diospyros virginiana (Ebenaceae)   12.0
66 - Magnolia grandiflora (Magnoliaceae)        12.0
50 - Zelkova carpinifolia (Ulmaceae)    12.0
7 - Eucommia ulmoides (Eucomiaceae)     12.0
48 - Acer monspessulanum (Sapindacaees) 12.0
58 - Diospyros kaki (Ebenaceae) 12.0
33 - Broussonetia papyrifera (Moraceae) 12.0
71 - Davidia involucrata (Cornaceae)    12.0
36 - Taxus baccata (Taxaceae)   13.0
96 - Pinus coulteri (Pinaceae)  14.0
94 - Diospyros virginiana (Ebenaceae)   14.0
68 - Diospyros kaki (Ebenaceae) 14.0
91 - Acer opalus (Sapindaceae)  15.0
5 - Catalpa bignonioides (Bignoniaceae) 15.0
70 - Fagus sylvatica (Fagaceae) 15.0
2 - Ulmus carpinifolia (Ulmaceae)       15.0
98 - Quercus ilex (Fagaceae)    15.0
78 - Acer cappadocicum (Sapindaceae)    16.0
16 - Celtis australis (Cannabaceae)     16.0
28 - Alnus glutinosa (Betulaceae)       16.0
75 - Zelkova carpinifolia (Ulmaceae)    16.0
83 - Zelkova serrata (Ulmaceae) 18.0
23 - Aesculus hippocastanum (Sapindaceae)       18.0
64 - Ginkgo biloba (Ginkgoaceae)        18.0
60 - Fagus sylvatica (Fagaceae) 18.0
8 - Platanus orientalis (Platanaceae)   20.0
20 - Fagus sylvatica (Fagaceae) 20.0
87 - Taxodium distichum (Taxodiaceae)   20.0
12 - Sequoiadendron giganteum (Taxodiaceae)     20.0
51 - Platanus x acerifolia (Platanaceae)        20.0
43 - Tilia tomentosa (Malvaceae)        20.0
35 - Paulownia tomentosa (Paulowniaceae)        20.0
34 - Corylus colurna (Betulaceae)       20.0
15 - Corylus colurna (Betulaceae)       20.0
1 - Corylus colurna (Betulaceae)        20.0
13 - Platanus orientalis (Platanaceae)  20.0
11 - Calocedrus decurrens (Cupressaceae)        20.0
86 - Platanus orientalis (Platanaceae)  22.0
47 - Aesculus hippocastanum (Sapindaceae)       22.0
14 - Pterocarya fraxinifolia (Juglandaceae)     22.0
88 - Liriodendron tulipifera (Magnoliaceae)     22.0
10 - Ginkgo biloba (Ginkgoaceae)        22.0
18 - Fagus sylvatica (Fagaceae) 23.0
31 - Ginkgo biloba (Ginkgoaceae)        25.0
24 - Cedrus atlantica (Pinaceae)        25.0
84 - Ginkgo biloba (Ginkgoaceae)        25.0
92 - Platanus x acerifolia (Platanaceae)        25.0
49 - Platanus orientalis (Platanaceae)  25.0
97 - Pinus nigra (Pinaceae)     25.0
73 - Platanus orientalis (Platanaceae)  26.0
42 - Platanus orientalis (Platanaceae)  27.0
65 - Pterocarya fraxinifolia (Juglandaceae)     27.0
85 - Juglans nigra (Juglandaceae)       28.0
52 - Fraxinus excelsior (Oleaceae)      30.0
29 - Zelkova carpinifolia (Ulmaceae)    30.0
37 - Cedrus libanii (Pinaceae)  30.0
27 - Sequoia sempervirens (Taxodiaceae) 30.0
25 - Fagus sylvatica (Fagaceae) 30.0
54 - Pterocarya stenoptera (Juglandaceae)       30.0
69 - Pinus nigra (Pinaceae)     30.0
41 - Platanus x acerifolia (Platanaceae)        30.0
77 - Taxodium distichum (Taxodiaceae)   30.0
30 - Aesculus hippocastanum (Sapindaceae)       30.0
55 - Platanus x acerifolia (Platanaceae)        30.0
38 - Fagus sylvatica (Fagaceae) 30.0
76 - Pinus nigra laricio (Pinaceae)     30.0
19 - Quercus petraea (Fagaceae) 30.0
72 - Sequoiadendron giganteum (Taxodiaceae)     30.0
59 - Sequoiadendron giganteum (Taxodiaceae)     30.0
22 - Cedrus libanii (Pinaceae)  30.0
9 - Platanus orientalis (Platanaceae)   31.0
80 - Quercus petraea (Fagaceae) 31.0
82 - Platanus x acerifolia (Platanaceae)        32.0
46 - Ginkgo biloba (Ginkgoaceae)        33.0
45 - Platanus orientalis (Platanaceae)  34.0
53 - Ailanthus giraldii (Simaroubaceae) 35.0
17 - Platanus x acerifolia (Platanaceae)        35.0
56 - Taxodium distichum (Taxodiaceae)   35.0
81 - Liriodendron tulipifera (Magnoliaceae)     35.0
57 - Sequoiadendron giganteum (Taxodiaceae)     35.0
40 - Platanus x acerifolia (Platanaceae)        40.0
26 - Platanus x acerifolia (Platanaceae)        40.0
74 - Platanus x acerifolia (Platanaceae)        40.0
90 - Platanus x acerifolia (Platanaceae)        42.0
21 - Platanus x acerifolia (Platanaceae)        45.0


# 1.8.6 District containing the oldest tree (difficult)

[anas.zaghloul@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar oldestTreeDistrictReduce  tree/tree.csv user/anas.zaghloul/186

[anas.zaghloul@hadoop-edge01 ~]$ hdfs dfs -cat user/anas.zaghloul/186/part-r-00000             
1601    5

# 1.8.7 District containing the most trees (very difficult)

[anas.zaghloul@hadoop-edge01 ~]$ yarn jar hadoop-examples-mapreduce-1.0-SNAPSHOT-jar-with-dependencies.jar maxTreesDistrict  tree/tree.csv user/anas.zaghloul/187

[anas.zaghloul@hadoop-edge01 ~]$ hdfs dfs -cat user/anas.zaghloul/187/part-r-00000

16      36

