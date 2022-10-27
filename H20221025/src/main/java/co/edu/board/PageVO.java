package co.edu.board;

public class PageVO {

	int totaclCnt;	// 전체건수
	int pageNum;	// 현재페이지
	int startPage, endPage, totalPage;	// 시작페이지, 마지막페이지
	boolean prev, next; //이전페이지로 이동, 다음페이지로 이동
	
	public PageVO(int totalCnt, int pageNum) {
		this.totaclCnt = totalCnt;
		this.pageNum = pageNum;
		
		totalPage = (int)Math.ceil(totalCnt/10.0);  // 51.2 ==> 51
		// startPage, endPage 계산
		this.endPage = (int)Math.ceil(this.pageNum/10.0)*10; // 10page
		this.startPage = this.endPage - 9; 
		if(this.endPage > totalPage){
			this.endPage = totalPage;// 1page
		}
		
		prev = this.startPage > 10; // 이전페이지
		next = this.endPage < totalPage; // 다음페이지
		
	}

	public int getTotaclCnt() {
		return totaclCnt;
	}

	public int getPageNum() {
		return pageNum;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public boolean isNext() {
		return next;
	}
	@Override
	public String toString() {
		return "PageVO [totaclCnt : " + totaclCnt + " pageNum : " + pageNum + " startPage : " + startPage 
				+ " endPage : " + endPage + " totalPage : " + totalPage + " prev : " + prev + " next : " + next + "]";
	
	}
	
}