package org.example;

public class _121 {
    public static void main(String[] args) {
        maxProfit(new int[]{7,1,5,3,6,4});
    }
    public static int maxProfit(int[] prices) {
        int gap = 0;
        int lowPrice = prices[0];
        for(int i=1; i<prices.length; i++) {
            if(lowPrice > prices[i]) {
                // 저점이 갱신되면 lowPrice 에 값넣기
                lowPrice = prices[i];
            }
            else if(lowPrice < prices[i] && gap < prices[i] - lowPrice) {
                // 저점이 갱신되지 않으면, 저점과 현재 지점을 비교하기
                gap = prices[i] - lowPrice;
            }
        }

        return gap;
    }
}
