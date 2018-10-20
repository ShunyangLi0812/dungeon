package ass2;

import java.util.HashMap;

public class MapDatas {
    private HashMap<Integer, int[][]> mapDatas;
    // private MapData mapData;
    private int[][] map_0 = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,14,0,0,0,0,10,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,3,1,0,0,1,1,1,1,0,0,1,1,1,1,0,1},
            {1,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,0,1},
            {1,0,0,0,0,0,0,0,1,0,0,16,0,8,0,0,0,1},
            {1,0,0,15,0,0,0,0,1,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,1,0,1,1,0,0,0,1,0,0,0,1},
            {1,0,0,0,0,0,1,0,0,0,0,0,1,1,0,0,0,1},
            {1,9,9,1,1,1,1,0,1,1,1,0,0,1,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,1,0,0,0,1,1,0,0,1},
            {1,0,0,1,0,1,1,6,0,0,0,12,0,0,0,0,0,1},
            {1,0,0,1,0,0,1,0,1,1,1,0,1,0,0,0,0,1},
            {1,0,0,1,0,0,0,0,0,1,0,0,1,0,0,0,0,1},
            {1,0,18,1,1,1,0,0,0,0,0,0,1,1,1,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,17,0,0,11,2,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    private int[][] map_1 = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,7,0,0,0,0,0,0,0,0,0,0,0,0,0,5,2,1},
            {1,0,1,1,1,1,1,0,4,0,0,0,0,0,0,0,11,1},
            {1,0,1,0,0,16,0,0,0,0,1,1,1,1,0,0,0,1},
            {1,0,1,0,3,0,0,0,0,0,0,5,0,1,0,0,0,1},
            {1,0,1,0,3,0,0,0,0,0,0,1,0,1,0,0,17,1},
            {1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1},
            {1,6,0,0,0,0,0,1,8,0,0,1,0,0,0,0,0,1},
            {1,15,0,4,0,0,0,1,14,0,9,1,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,1,1,1,0,1,0,0,1,0,18,1},
            {1,0,0,1,0,0,0,0,0,0,0,1,0,0,1,0,0,1},
            {1,13,0,1,0,10,0,0,0,0,0,1,0,0,1,0,0,1},
            {1,0,0,1,0,0,0,0,0,0,0,1,1,1,1,0,0,1},
            {1,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,7,0,0,0,0,0,0,9,0,0,0,12,0,11,0,11,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    private int[][] map_2 = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,6,6,6,6,6,6,0,0,18,0,0,0,0,9,9,7,1},
            {1,5,5,5,5,5,6,0,0,0,0,0,0,0,0,9,0,1},
            {1,12,8,8,8,5,6,0,0,0,0,0,0,0,9,0,0,1},
            {1,8,8,8,8,5,6,0,0,0,0,0,0,0,0,0,0,1},
            {1,5,5,5,5,5,6,0,0,0,0,0,0,0,0,0,0,1},
            {1,6,6,6,6,6,6,0,0,0,1,1,1,1,1,4,4,1},
            {1,14,0,0,0,0,0,0,0,0,1,11,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,1,13,0,0,0,0,1},
            {1,0,1,1,1,1,1,0,0,0,0,1,1,1,1,0,0,1},
            {1,0,1,17,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,10,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,1,1,0,0,0,0,0,0,0,0,0,0,0,3,3,3,1},
            {1,1,1,0,0,0,0,0,0,0,0,0,0,0,3,2,3,1},
            {1,7,0,0,0,16,0,0,0,0,0,0,0,0,3,3,3,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    private int[][] map_3 = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,2,5,0,0,0,0,0,0,0,0,0,0,10,0,0,0,1},
            {1,5,5,0,0,0,1,1,1,1,1,0,0,0,0,0,0,1},
            {1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1},
            {1,13,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,10,0,1,1,1,0,0,0,0,0,0,0,0,0,0,16,1},
            {1,0,0,0,1,1,1,1,1,1,0,0,0,0,9,9,9,1},
            {1,0,0,0,0,0,0,1,14,1,0,0,0,0,9,7,9,1},
            {1,0,0,0,0,0,0,1,7,1,0,0,0,0,9,9,9,1},
            {1,0,0,1,1,1,0,1,5,1,0,0,0,0,0,0,17,1},
            {1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1},
            {1,3,3,3,0,0,0,0,0,0,0,0,1,0,0,0,0,1},
            {1,3,3,3,0,0,0,0,0,0,0,0,1,10,0,0,0,1},
            {1,3,3,3,15,0,0,0,0,0,0,0,1,0,0,0,6,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    private int[][] map_4 = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,11,0,0,0,0,0,0,0,0,0,0,0,0,3,9,2,1},
            {1,0,1,1,1,0,0,0,0,0,12,17,0,0,0,0,0,1},
            {1,0,1,18,0,0,0,0,0,0,1,1,1,0,0,0,0,1},
            {1,0,1,0,1,1,1,0,0,0,0,0,0,0,0,1,0,1},
            {1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,1},
            {1,0,0,0,1,0,1,1,1,3,3,3,3,3,3,1,0,1},
            {1,0,13,0,0,0,1,0,0,0,0,0,0,1,1,1,15,1},
            {1,0,0,0,0,0,1,0,8,0,0,0,0,0,0,1,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,1,1,1,0,0,1,1,1,0,0,1,1,1,0,1},
            {1,0,0,1,0,0,0,0,0,1,0,0,16,0,0,1,0,1},
            {1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1},
            {1,14,0,0,0,0,0,0,0,6,0,0,0,0,0,0,10,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };

    private int[][] map_99 = {
            {14,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
    };

    public MapDatas () {
        this.mapDatas = new HashMap<Integer, int[][]>();
        this.mapDatas.put(0,map_0);
        this.mapDatas.put(1,map_1);
        this.mapDatas.put(2,map_2);
        this.mapDatas.put(3,map_3);
        this.mapDatas.put(4,map_4);
        this.mapDatas.put(99,map_99);
    }

    public int[][] getMapByIndex (int index) {
        if (index == 99) {
            return this.mapDatas.get(index);
        } else if (index <= this.mapDatas.size() - 2) {
            return this.mapDatas.get(index);
        } else {
            return null;
        }
    }

    public int total() {
        return this.mapDatas.size();
    }

}


