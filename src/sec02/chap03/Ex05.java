package sec02.chap03;

public class Ex05 {
    public static void main(String[] args) {
        // 자바의 식별자 명명 규칙
        // 문자 또는 $, _로 시작해야 함
        // 공백 포함할 수 없음

        // 클래스는 대문자로 시작
        // 변수나 메서드는 camal case 사용 (🐪🐫낙타의 등 같이 생겨서 camel case)
        // myName, myAddress, buildingHeight

        final int A_NUM = 2; // final 연산자 : 변수의 값을 바꾸지 못하게 만듦 -> 상수라고 하며 상수는 대문자와 _로 지음
        // A_NUM = 2; 불가

        // 변수 이름은 의미있게 지을 것

        // 예약어 : 식별자로 사용 불가한 키워드들
        /*
        abstract	continue	for	new	switch
        assert***	default	goto*	package	synchronized
        boolean	do	if	private	this
        break	double	implements	protected	throw
        byte	else	import	public	throws
        case	enum****	instanceof	return	transient
        catch	extends	int	short	try
        char	final	interface	static	void
        class	finally	long	strictfp**	volatile
        const*	float	native	super	while
         */
    }
}
