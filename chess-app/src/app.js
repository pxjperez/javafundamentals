const boardSize = 8;
let board = [];
let selectedPiece = null;
let selectedPiecePosition = null;

function createBoard() {
    const chessboard = document.getElementById('chessboard');
    for (let row = 0; row < boardSize; row++) {
        board[row] = [];
        for (let col = 0; col < boardSize; col++) {
            const square = document.createElement('div');
            square.classList.add('square');
            square.classList.add((row + col) % 2 === 0 ? 'white' : 'black');
            square.addEventListener('click', () => handleSquareClick(row, col));
            chessboard.appendChild(square);
            board[row][col] = square;
        }
    }
    placePieces();
}

function placePieces() {
    const initialPositions = [
        ['R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'],
        ['P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'],
        [], [], [], [],
        ['p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'],
        ['r', 'n', 'b', 'q', 'k', 'b', 'n', 'r']
    ];

    for (let row = 0; row < boardSize; row++) {
        for (let col = 0; col < boardSize; col++) {
            if (initialPositions[row][col]) {
                const piece = document.createElement('span');
                piece.textContent = initialPositions[row][col];
                board[row][col].appendChild(piece);
            }
        }
    }
}

function handleSquareClick(row, col) {
    if (selectedPiece) {
        movePiece(row, col);
    } else {
        selectPiece(row, col);
    }
}

function selectPiece(row, col) {
    const square = board[row][col];
    if (square.firstChild) {
        selectedPiece = square.firstChild;
        selectedPiecePosition = { row, col };
        square.classList.add('selected');
    }
}

function movePiece(row, col) {
    const targetSquare = board[row][col];
    if (!targetSquare.firstChild) {
        targetSquare.appendChild(selectedPiece);
        board[selectedPiecePosition.row][selectedPiecePosition.col].classList.remove('selected');
        selectedPiece = null;
        selectedPiecePosition = null;
    }
}

function init() {
    board = Array.from({ length: boardSize }, () => Array(boardSize).fill(null));
    createBoard();
}

document.addEventListener('DOMContentLoaded', init);