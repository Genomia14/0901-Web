import {
  createContext,
  useCallback,
  useContext,
  useState,
  type FC,
  type PropsWithChildren,
} from "react";

export type LoggedUser = { email: string; password: string };
type Callback = () => void;
type ContextType = {
  loggedUser?: LoggedUser;
  signup: (email: string, password: string, callback?: Callback) => void;
  login: (email: string, password: string, callback?: Callback) => void;
  logout: (callback?: Callback) => void;
};

export const AuthContext = createContext<ContextType>({
  signup: (email: string, passwrod: string, callback?: Callback) => {},
  login: (email: string, passwrod: string, callback?: Callback) => {},
  logout: (callback?: Callback) => {},
});
type AuthproviderProps = {};

export const Authprovider: FC<PropsWithChildren<AuthproviderProps>> = ({
  children,
}) => {
  const [loggedUser, setLoggedUser] = useState<LoggedUser | undefined>(
    undefined,
  );

  const signup = useCallback(
    (email: string, password: string, callback?: Callback) => {
      setLoggedUser((notUsed) => ({ email, password }));
      callback && callback();
    },
    [],
  );

  const login = useCallback(
    (email: string, password: string, callback?: Callback) => {
      setLoggedUser((notUsed) => ({ email, password }));
      callback && callback();
    },
    [],
  );

  const logout = useCallback((callback?: Callback) => {
    setLoggedUser(undefined);
    callback && callback();
  }, []);

  const value = {
    loggedUser,
    signup,
    login,
    logout,
  };
  return <AuthContext.Provider value={value} children={children} />;
};

export const useAuth = () => {
  return useContext(AuthContext);
};
