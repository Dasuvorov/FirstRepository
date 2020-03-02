//import java.awt.*;
//import java.awt.event.*;
//import java.applet.Applet;
//
//
//public class TicTacToe extends Applet  impliments ActionListener{
//
//	Button squares [];
//	Button newGameButton;
//	Label score;
//	int emptySquaresLeft = 9;
//
//	/*
//	*Метод init() этоконструктор applet
//
//	*/
//
//		public void init(){
//			//Устанавливаем менеджер расположения апплета, шрифт и цвет
//
//			this.setLayout(new BorderLayout());
//			this.setBackground(Color.CYAN);
//
//				// Изменяем шрифт апплета так, чтобы он был жирным
//				// и имел размер 20
//			Font appletFont = new Font("Monospased", Font.BOLD, 20);
//			this.setFont(appletFont);
//		// Создаем кнопку “New Game” и регистрируем в ней
//		// слушатель действия
//
//		newGameButton = new Button("New Game");
//		newGameButton.addActionListener(this);
//
//			Panel topPanel = new Panel();
//			topPanel.add(newGameButton);
//			this.add(topPanel,"North");
//			Panel centerPanel = new Panel();
//			centerPanel.setLayout(new GridLayout(3,3));
//			this.add(centerPanel,"Center");
//
//			score = new Label("Your turn");
//			this.add(score,"South");
//
//			// создаем массив, чтобы хранить ссылки на 9 кнопок
//
//
//			squares = new Button[9];
//
//			// Создаем кнопки, сохраняем ссылки на них в массиве
//			// регистрируем в них слушатель, красим их
//			// в оранжевый цвет и добавляем на панель
//
//				for(int i =0; i<9; i++){
//					squares[i] = new Button();
//					squares[i].addActionListener(this);
//					squares[i].setBackground(Color.ORANGE);
//					centerPanel.add(squares[i]);
//
//				}
//
//
//		}
//
//	/**
//	 * Этот метод будет обрабатывать все события
//	 * @param ActionEvent объект
//	 */
//
//
//
//
//
//}