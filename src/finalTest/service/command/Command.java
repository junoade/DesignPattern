package finalTest.service.command;

import java.io.IOException;

/**
 * 커맨드 패턴을 적용하여, 사용자가 화면에서 입력한 명령을 처리(Concrete Command)하여 DB에 전달
 * Invoker : MemberProxy
 * Recevier : MemoryDB
 *
 * 2017112095 컴퓨터공학과 최준호
 */
public interface Command {
    void execute() throws IOException;
    void save();
}
