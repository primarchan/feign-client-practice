## Logback

### Logback 개념 (1)
> - `SL4J (Simple Logging Facade for Java)` 라는 인터페이스를 구현하는 구현체이다.
> - Simple Logging Facade for Java provides a Java logging API by means of a simple facade pattern.
> The underlying logging backend is determined at runtime by adding the desired binding to the classpath and may be the
> standard Sun Java logging package java.util.logging, log4j, reload4j, logback or tinylog.
> - 즉, Logging Framework 라고 생각하면 된다.
<hr>

### Logback 개념 (2)
`Appender` 종류
- `ConsoleAppender` : 콘솔에 `log` 를 출력
- `FileAppender` : 파일 단이로 `log` 를 저장
- `RollingFileAppender` : (설정 옵션에 따라 `log` 를 여러 파일로 나누어 저장)
- `SMTPAppender` : `log` 를 메일로 전송하여 기록
- `DBAppender` : `log` 를 `DB` 에 저장
<hr>

### Logback 사용 이유
> - 운영을 위해서는 Log 는 반드시 필요하다.
> - Logback 설정을 하여 운영을 하기 위한 Log 를 관리한다.
> - 뿐만 아니라 데이터는 돈이므로 Log 는 곧 값 비싼 자산이다.