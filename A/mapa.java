package TFP;

import java.util.Arrays;

class Map {
    private int[][] grid;

    // Constructor: 3x3 boyutunda bir harita oluşturuyor ve başlangıçta 1'den 9'a kadar olan değerleri atıyor
    public Map() {
        grid = new int[3][3];
        
        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = value++;  // Her hücreye 1'den 9'a kadar sıralı değer atama
            }
        }
    }

    // Oyuncuyu haritada bir konuma yerleştir
    public void placePlayer(int position, int health) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == position) {
                    grid[i][j] = health;  // Oyuncunun sağlığını yerleştir
                   
                }else {
                	grid[i][j] = -2;
                }
            }
        }
    }



	// Haritayı ekrana yazdır
    public void printMap() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(grid[i]));
        }
    }
}


