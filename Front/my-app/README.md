- Remove-Item "node_modules" -Recurse -Force
- Remove-Item "package-lock.json" -Force
- npm install

eslint 간 충돌 오류 나면 폴더 내부로 들어가서 시작해보고 안되면 오류 메시지 확인