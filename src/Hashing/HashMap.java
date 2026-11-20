package Hashing;

import java.util.*;

public class HashMap {

    private class HashMapCode<k, v>{

        public class Node{

            k key;
            v value;

            Node(k data, v val){
                this.key = data;
                this.value = val;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> list[];

        HashMapCode(){
            this.N = 4;
            this.list = new LinkedList[4];
            for(int i=0; i<4; i++){
                list[i] = new LinkedList<>();
            }
        }


    }
}
