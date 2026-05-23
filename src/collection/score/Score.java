package collection.score;

public interface Score {
	public void input(); //입력
    public void print(); //출력
    public void printTitle(); //제목 출력
    public void searchHak(); //학번 검색
    public void searchName(); //이름 검색
    public void descSortTot(); //총점을 기준으로 내림차순 정렬
    public void ascSortHak(); //학번을 기준으로 오름차순 정렬
    public void saveFile(); //파일 저장
    public void readFile(); //파일 읽기
    
    
}
