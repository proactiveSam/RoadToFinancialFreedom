package pers.sam.czsc.dto;

/**
 * 分笔DTO，代表一笔
 * @author Administrator
 *
 */
public class StrokeDTO implements Cloneable{
	
	//开始
	private MergeLineDTO  startMLine;
	
	//结束
	private MergeLineDTO endMLine;

	//方向，向上或者向下  up/down
	private String direction;
	
	public MergeLineDTO getStartMLine() {
		return startMLine;
	}

	public void setStartMLine(MergeLineDTO startMLine) {
		this.startMLine = startMLine;
	}

	public MergeLineDTO getEndMLine() {
		return endMLine;
	}

	public void setEndMLine(MergeLineDTO endMLine) {
		this.endMLine = endMLine;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	
	public Double getHigh(){
		if("up".equals(direction)){
			return this.getEndMLine().getHigh();
		}else if("down".equals(direction)){
			return this.getStartMLine().getHigh();
		}
		return null;
	}
	
	public Double getLow(){
		if("up".equals(direction)){
			return this.getStartMLine().getLow();
		}else if("down".equals(direction)){
			return this.getEndMLine().getLow();
		}
		return null;
	}

	public StrokeDTO clone() { 
		StrokeDTO clone = null; 
        try{ 
            clone = (StrokeDTO) super.clone(); 
 
        }catch(CloneNotSupportedException e){ 
            throw new RuntimeException(e); // won't happen 
        }
        return clone; 
    }
}
