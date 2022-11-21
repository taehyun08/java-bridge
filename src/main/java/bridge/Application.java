package bridge;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        int bridgeSize = inputView.readBridgeSize();
        BridgeGame bridgeGame = new BridgeGame(bridgeSize);

        List<String> bridge = bridgeGame.getBridge();
        for(String str : bridge)
            System.out.print(str);

        String move;
        boolean canMove;
        do {
            move = inputView.readMoving();
            canMove = bridgeGame.canMove(move);
            outputView.printMap(bridgeGame.getMove(), canMove);
        } while (canMove && !bridgeGame.success());



    }
}

