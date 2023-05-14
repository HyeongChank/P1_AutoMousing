from flask import Flask, request
import pyautogui
import time

app = Flask(__name__)

@app.route('/clickCoordinates', methods=['POST'])
def click_coordinates():
    coordinates = request.json
    
    x1 = None; y1 = None; interval1 = None
    x2 = None; y2 = None; interval2 = None
    x3 = None; y3 = None; interval3 = None
    x4 = None; y4 = None; interval4 = None
    x5 = None; y5 = None; interval5 = None
    x6 = None; y6 = None; interval6 = None

    # 리액트에서 받은 좌표
    x1 = coordinates['x1']
    if x1 is not None:
        x1 = int(x1)
        python_x1 = x1 / 100 * 90
    else:
        python_x1 = None
    y1 = coordinates['y1']
    if y1 is not None:
        y1 = int(y1)
        python_y1 = y1 / 100 * 90
    else:
        python_y1 = None    
    x2 = coordinates['x2']
    if x2 is not None:
        x2 = int(x2)
        python_x2 = x2 / 100 * 90
    else:
        python_x2 = None    
    y2 = coordinates['y2']
    if y2 is not None:
        y2 = int(y2)
        python_y2 = y2 / 100 * 90
    else:
        python_y2 = None    
    x3 = coordinates['x3']
    if x3 is not None:
        x3 = int(x3)
        python_x3 = x3 / 100 * 90
    else:
        python_x3 = None
    y3 = coordinates['y3']
    if y3 is not None:
        y3 = int(y3)
        python_y3 = y3 / 100 * 90
    else:
        python_y3 = None    
    x4 = coordinates['x4']
    if x4 is not None:
        x4 = int(x4)
        python_x4 = x4 / 100 * 90
    else:
        python_x4 = None
    y4 = coordinates['y4']
    if y4 is not None:
        y4 = int(y4)
        python_y4 = y4 / 100 * 90
    else:
        python_y4 = None    
    x5 = coordinates['x5']
    if x5 is not None:
        x5 = int(x5)
        python_x5 = x5 / 100 * 90
    else:
        python_x5 = None
    y5 = coordinates['y5']
    if y5 is not None:
        y5 = int(y5)
        python_y5 = y5 / 100 * 90
    else:
        python_y5 = None    
    x6 = coordinates['x6']
    if x6 is not None:
        x6 = int(x6)
        python_x6 = x6 / 100 * 90
    else:
        python_x6 = None
    y6 = coordinates['y6']
    if y6 is not None:
        y6 = int(y6)
        python_y6 = y6 / 100 * 90
    else:
        python_y6 = None    
    interval1 = coordinates['interval1']
    if interval1 is not None:
        interval1 = int(interval1)
    else:
        interval1 = None
    interval2 = coordinates['interval2']
    if interval2 is not None:
        interval2 = int(interval2)
    else:
        interval2 = None
    interval3 = coordinates['interval3']
    if interval3 is not None:
        interval3 = int(interval3)
    else:
        interval3 = None
    interval4 = coordinates['interval4']
    if interval4 is not None:
        interval4 = int(interval4)
    else:
        interval4 = None
    interval5 = coordinates['interval5']
    if interval5 is not None:
        interval5 = int(interval5)
    else:
        interval5 = None
    interval6 = coordinates['interval6']
    if interval6 is not None:
        interval6 = int(interval6)
    else:
        interval6 = None
    roop = int(coordinates['roop'])
    indb = coordinates['indb']

    # 화면 해상도
    screen_width = 1920
    screen_height = 1080

    for i in range(1, roop+1):
        if python_x1 is not None:
            pyautogui.moveTo(python_x1,python_y1)
            pyautogui.click()
        if interval1 is not None:
            time.sleep(interval1)
        if python_x2 is not None:
            pyautogui.moveTo(python_x2,python_y2)
            pyautogui.click()
        if interval2 is not None:    
            time.sleep(interval2)
        if python_x3 is not None:    
            pyautogui.moveTo(python_x3,python_y3)
            pyautogui.click()
        if interval3 is not None:    
            time.sleep(interval3)
        if python_x4 is not None:                
            pyautogui.moveTo(python_x4,python_y4)
            pyautogui.click()
        if interval4 is not None:                
            time.sleep(interval4)
        if python_x5 is not None:                    
            pyautogui.moveTo(python_x5,python_y5)
            pyautogui.click()
        if interval5 is not None:                    
            time.sleep(interval5)
        if python_x6 is not None:                        
            pyautogui.moveTo(python_x6,python_y6)
            pyautogui.click()
        if interval6 is not None:                        
            time.sleep(interval6)
    
    return 'Success'

if __name__ == '__main__':
    app.run()