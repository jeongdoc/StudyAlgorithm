package programmers.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Printer {

	public static void main(String[] args) {
		// 프로그래머스 - 프린터
		// 55점짜리 미완코드
		Stack<Integer> st = new Stack<>();
		Queue<Integer> q = new LinkedList<>();
		int []priorities = new int [] {1, 1, 9, 1, 1, 1};
		//int []priorities = new int [] {2, 1, 3, 2};
        int location = 0;
        int temp = 0;
        int answer = 0;
        
        //queue에 저장
        for(int i = 0; i < priorities.length; i ++) {
        	q.offer(priorities[i]);
        }
        //swap 이용
        for(int i = 0; i < priorities.length; i++){
            for(int j = priorities.length - 1; j > i; j--){
                if(priorities[j - 1] > priorities[j]) {
                	temp = priorities[i];
                	priorities[i] = priorities[j];
                	priorities[j] = temp;
                }
            }
        }
        //비교해야하니까 stack 저장
        for(int i = 0; i < priorities.length; i ++) {
        	st.push(priorities[i]);        	
        }
        //비교시작        
        while(!q.isEmpty()) {
        	if(q.peek().equals(st.peek())) {
        		if(location == 0) {
        			//내가 찾는 값
        			answer ++;
        			break;
        		} else {
        			//값 삭제 작업
        			q.poll();
                    st.pop();
                    answer++;
                    location--;
        		}
        	} else {
        		//queue와 stack의 값이 같지 않으면 queue값을 뒤로 이동
        		//값의 위치가 바뀌었으니 위치값 감소시켜줌
        		q.offer(q.poll());
                if(location == 0) 
                	location = q.size() - 1;
                else 
                	location--;
        	}
        }
        System.out.println(answer);
	}

}